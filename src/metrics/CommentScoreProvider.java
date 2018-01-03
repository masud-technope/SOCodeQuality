package metrics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import ranks.CodeHealth;
import extractor.StaticData;

public class CommentScoreProvider {

	/**
	 * @param args
	 */
	static HashMap<Integer, Double> strength=new HashMap<>();
	static HashMap<Integer, Double> weakness=new HashMap<>();
	static HashMap<Integer, Double> discussion=new HashMap<>();
	static HashMap<Integer, Integer> questionMap=new HashMap<>();
	
	protected static void loadPostCommentScores()
	{
		//code for loading the scores
		String commen2=StaticData.Data_Directory+"/comment2.txt";
		File f=new File(commen2);
		try {
			Scanner scanner = new Scanner(f);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String parts[] = line.split("\\s+");
				int questionID=Integer.parseInt(parts[0]);
				for (int i = 1; i < parts.length; i++) {
					String ansParts[] = parts[i].split(":");
					int postID = Integer.parseInt(ansParts[0].trim());
					int str = 0;
					int weak = 0;
					int total = 0;
					double strength_score = 0;
					double weakness_score = 0;
					double discussion_score = 0;
					if (ansParts[1].contains("/")) {
						String[] ansScore = ansParts[1].split("/");
						str = Integer.parseInt(ansScore[0]);
						weak = Integer.parseInt(ansScore[1]);
						total = str + weak;
						if (total > 0) {
							strength_score = str;
							weakness_score =weak;
							discussion_score = total;
						}
					}
					strength.put(postID, strength_score);
					weakness.put(postID, weakness_score);
					discussion.put(postID, discussion_score);
					questionMap.put(postID, questionID);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static double getDiscussionScore(int postID)
	{
		return discussion.get(postID).doubleValue();
	}
	
	
	
	public static CodeHealth getCommentEvaluationScore(int postID)
	{
		if(discussion.isEmpty())
		loadPostCommentScores();
		//code for getting comment based scores
		double comment_score=0;
		double strong=strength.get(postID).doubleValue();
		double weak=weakness.get(postID).doubleValue();
		double total=strong+weak;
		if(total==0)total=1; //avoids /by zero.
		CodeHealth chealth=new CodeHealth();
		int questionID=questionMap.get(postID);
		//int SLOC=CodeHealth.getSourceLOC(questionID, postID);
		//if(SLOC==0)SLOC=15;
		chealth.positiveAspect=strong/total;
		chealth.negativeAspect=weak/total;
		chealth.totalAspect=total;
		return chealth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
