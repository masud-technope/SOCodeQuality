package metrics;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import ranks.CodeHealth;
import ranks.ExtremeResultAgreement;
import ranks.SOPost;
import utility.ContentLoader;
import extractor.StaticData;

public class MyCodeMetricsRankManager {

	/**
	 * @param args
	 */
	ExtremeResultAgreement extremeAgreement;
	HashMap<Integer, Integer> labeldict;
	HashMap<Integer, Integer> maxmindict;
	
	public MyCodeMetricsRankManager()
	{
		//default constructor
		extremeAgreement=new ExtremeResultAgreement();
		//extremeAgreement.loadPostLabels();
		this.labeldict=new HashMap<>();
		this.loadIdentifiedLabel();
		this.maxmindict=new HashMap<>();
		this.loadmaxmin();
	}
	
	protected void loadIdentifiedLabel()
	{
		String labelFile=StaticData.Data_Directory+"/labeldict.txt";
		try
		{
			File f=new File(labelFile);
			Scanner scanner=new Scanner(f);
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				String[] parts=line.split("\\s+");
				int postID=Integer.parseInt(parts[0]);
				int label=Integer.parseInt(parts[1]);
				this.labeldict.put(postID, label);
			}
		}catch(Exception exc){
			
		}
	}
	
	protected void loadmaxmin() {
		// loading max min id
		String maxminFile = StaticData.Data_Directory + "/max_min_id.txt";
		String content = ContentLoader.loadFileContent(maxminFile);
		String lines[] = content.split("\n");
		for (String line : lines) {
			if (!line.trim().isEmpty()) {
				String[] parts = line.split("\\s+");
				int max = Integer.parseInt(parts[1].trim());
				int min = Integer.parseInt(parts[2].trim());
				this.maxmindict.put(max, 1);
				this.maxmindict.put(min, 0);
			}
		}
	}
	
	protected ArrayList<SOPost> normalize_scores(ArrayList<SOPost> myitems)
	{
		//code for normalizing the scores
		double max_readability=0;
		double max_reputation=0;
		double max_discussion=0;
		double max_violation=0;
		for(SOPost post:myitems){
			if(post.readability>max_readability)
				max_readability=post.readability;
			if(post.authorRank>max_reputation)
				max_reputation=post.authorRank;
			if(post.discussionCount>=max_discussion){
				max_discussion=post.discussionCount;
			}
		}
		for(SOPost post:myitems)
		{
			if(max_discussion>0){
				post.discussionCount=post.discussionCount/max_discussion;
				//using discussion measure to influence code soundness
				//post.codeSoundness=post.codeSoundness*post.discussionCount;
				post.strength=post.strength*post.discussionCount;
				post.weakness=post.weakness*post.discussionCount;
				post.codeSoundness=post.strength-post.weakness;
			}
			//sonar violation acts negatively
			//post.sonarViolation*=-1;
			//post.weakness*=-1;
		}
		
		for(SOPost spost:myitems)
		{
			//spost.totalMetricsScore=LogisticRegresser.getOddsRatio(spost.readability, spost.authorRank, 
					//spost.codeSoundness, spost.sonarViolation);
			//spost.totalMetricsScore=LogisticRegresser.getOddsRatio(spost.readability, spost.authorRank, 
					//spost.strength, spost.weakness, spost.sonarViolation);
			spost.totalMetricsScore=MyQualityScoreProvider.getEstimatedQualityWeight(spost.readability, spost.authorRank, 
					spost.strength, spost.weakness, spost.sonarViolation);
			
			//spost.totalMetricsScore=MyQualityScoreProvider.getEstimatedQualityWeight(spost.readability, spost.authorRank, 
					//spost.codeSoundness, spost.sonarViolation);
			
			/*spost.totalMetricsScore= readabilty_weight*spost.readability+authorRank_weight*spost.authorRank+
					+spost.codeSoundness*code_soundness_weight+ spost.sonarComplianceScore*sonar_compliance_weight+
					low_complexity_weight*spost.cComplexity;*/
		}
		
		return myitems;
	}
	
	
	protected String extract_extreme_scored_posts(int questionID, ArrayList<SOPost> items)
	{
		//code for ranking the scores
		ArrayList<SOPost> norm_items=normalize_scores(items);
		norm_items=sort_the_post_items(norm_items);
		SOPost maxPost=norm_items.get(0);
		SOPost minPost=norm_items.get(norm_items.size()-1);
		//String line=questionID+" "+maxPost.postID+":"+maxPost.totalMetricsScore+"\t"+minPost.postID+":"+minPost.totalMetricsScore;
		String line=questionID+"\t"+maxPost.postID+"\t"+minPost.postID;
		return line;
		
	}
	
	protected String extract_extreme_scores(int questionID, ArrayList<SOPost> items)
	{
		ArrayList<SOPost> norm_items=normalize_scores(items);
		norm_items=sort_the_post_items(norm_items);
		
		String line1=new String();
		SOPost post1=norm_items.get(0);
		int label1=post1.postID;
		if(this.labeldict.containsKey(post1.postID))
		label1=this.labeldict.get(post1.postID);
		//int label1=extremeAgreement.postLabelDict.get(new Integer(post1.postID)).intValue();
		line1=post1.readability+"\t"+post1.authorRank+"\t"+post1.strength+"\t"+post1.weakness+"\t"+post1.sonarViolation+"\t"+label1+"\t"+post1.postID;
		//line1=post1.readability+"\t"+post1.authorRank+"\t"+post1.codeSoundness+"\t"+post1.sonarViolation+"\t"+label1;
		String line2=new String();
		SOPost post2=norm_items.get(1);
		int label2=post2.postID;
		if(this.labeldict.containsKey(post2.postID))
		label2=this.labeldict.get(post2.postID);
		//int label2=extremeAgreement.postLabelDict.get(post2.postID).intValue();
		line2=post2.readability+"\t"+post2.authorRank+"\t"+post2.strength+"\t"+post2.weakness+"\t"+post2.sonarViolation+"\t"+label2+"\t"+post2.postID;
		//line2=post2.readability+"\t"+post2.authorRank+"\t"+post2.codeSoundness+"\t"+post2.sonarViolation+"\t"+label2;
		return line1+"\n"+line2;
	}
	
	
	
	protected ArrayList<SOPost> sort_the_post_items(ArrayList<SOPost> items) {
		// code for sorting the post items
		Collections.sort(items, new CustomComparator_tms());
		return items;
	}

	public class CustomComparator_tms implements Comparator<SOPost> {
		@Override
		public int compare(SOPost o1, SOPost o2) {
			if (o1.totalMetricsScore > o2.totalMetricsScore)
				return -1;
			else if (o1.totalMetricsScore < o2.totalMetricsScore)
				return 1;
			else
				return 0;
		}
	}
	
	public void get_code_metrics_ranks()
	{
		try {
			String cqa5_3=StaticData.Data_Directory+"/metdata/cr505.txt";
			String codeFile = StaticData.Data_Directory + "/extremedata"; //answer_formatted
			File f = new File(codeFile);
			if (f.isDirectory()) {
				File[] files = f.listFiles();
				//FileWriter fwriter=new FileWriter(new File(cqa5_3));
				for (File f2 : files) {
					//System.out.println(f2.getName());
					//System.out.println("------------");
					if (f2.isDirectory()) {
						File[] codeFiles = f2.listFiles();
						ArrayList<SOPost> myitems = new ArrayList<>();
						for (File f3 : codeFiles) {
							String code = ContentLoader.loadFileContent(f3.getAbsolutePath());
							SOPost spost = new SOPost();
							//getting readability
							double readability_score = ReadabilityProvider.get_readability_score(code);
							//double readability_score = new HealsteadComplexityProvider(code).getHalsteadReadabilityScore();
							spost.readability = readability_score;
							//System.out.println(f3.getName()+": Readability score:"+readability_score);
							int postID = Integer.parseInt(f3.getName().split(
									"\\.")[0].split("_")[1]);
							//getting author reputation
							double norm_reputation = AuthorReputationProvider
									.get_author_normalized_reputation(postID);
							spost.authorRank = norm_reputation;
							//System.out.println("Author normalized reputation:"+norm_reputation);
							//getting code soundness
							CodeHealth chealth=CommentScoreProvider.getCommentEvaluationScore(postID);
							spost.strength=chealth.positiveAspect;
							spost.weakness=chealth.negativeAspect;
							spost.discussionCount=chealth.totalAspect;
							//System.out.println("Strength: "+spost.strength+", Weakness:"+spost.weakness+", Total:"+spost.discussionCount);
							//getting sonar compliance
							double sonarViolation=SonarIssueScoreProvider.getSonarIssueScore(postID);
							spost.sonarViolation=sonarViolation;
							spost.postID=postID;
							myitems.add(spost);
							
							//System.out.println("R:"+spost.readability+" AR="+spost.authorRank+" S="+spost.strength+" W="+spost.weakness+" RV="+spost.sonarViolation);
							System.out.println(spost.readability+"\t"+spost.authorRank+"\t"+spost.strength+"\t"+spost.weakness+"\t"+spost.sonarViolation+"\t"+this.maxmindict.get(postID).intValue());
						}
						
						 //int questionID=Integer.parseInt(f2.getName());
                         //rank_SO_posts_on_score(questionID,myitems);
						 //String line=extract_extreme_scored_posts(questionID, myitems);
						 //String line=extract_extreme_scores(questionID, myitems);
						 //fwriter.write(line+"\n");
						 //System.out.println("================"); 
					}
				}
				//fwriter.close();
			}
			//now performing the agreement analysis
			//new ExtremeResultAgreement(cqa5_3).getResultAgreements();
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCodeMetricsRankManager manager=new MyCodeMetricsRankManager();
		manager.get_code_metrics_ranks();

	}

}
