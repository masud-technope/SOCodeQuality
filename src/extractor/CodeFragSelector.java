package extractor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import utility.ContentLoader;
import utility.ContentSaver;

public class CodeFragSelector {
	int postID;
	HashMap<Integer, Integer> votemap;

	public CodeFragSelector(int postID) {
		this.postID = postID;
		this.votemap = new HashMap<>();
		this.loadVoteMap();
	}

	protected void loadVoteMap() {
		// loading the post + votes
		String statfile = StaticData.SOPostData + "/answerstat.txt";
		try {
			Scanner scanner = new Scanner(new File(statfile));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] parts = line.split("\\s+");
				int questionID = Integer.parseInt(parts[0].trim());
				if (questionID == postID) {
					int answerID = Integer.parseInt(parts[1].trim());
					int vote = Integer.parseInt(parts[2].trim());
					if (!votemap.containsKey(answerID)) {
						votemap.put(answerID, vote);
					}
				}
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected  List<Map.Entry<Integer, Integer>> sortHashMap(
			HashMap<Integer, Integer> votemap) {
		// sorting the Hash Map
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(
				votemap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> arg0,
					Entry<Integer, Integer> arg1) {
				// TODO Auto-generated method stub
				Integer value1 = arg0.getValue();
				Integer value2 = arg1.getValue();
				return value2.compareTo(value1);
			}
		});
		return list;
	}
	
	protected void getExtremePosts()
	{
		//getting code elements from extreme posts
		List<Map.Entry<Integer, Integer>> sortedList=sortHashMap(votemap);
		int top1=0,top2=0,top3=0;
		int low1=0, low2=0, low3=0;
		
		int count=0;
		for(Map.Entry<Integer, Integer> entry:sortedList){
			if(count==0)top1=entry.getKey();
			if(count==1)top2=entry.getKey();
			if(count==2)top3=entry.getKey();
			if(count==sortedList.size()-3)low3=entry.getKey();
			if(count==sortedList.size()-2)low2=entry.getKey();
			if(count==sortedList.size()-1)low1=entry.getKey();
			count++;
		}
		
		//saving the codes
		extractCodeElems(top1);
		System.out.println("Top1 :"+top1);
		extractCodeElems(top2);
		System.out.println("Top2 :"+top2);
		extractCodeElems(top3);
		System.out.println("Top3 :"+top3);
		
		extractCodeElems(low3);
		System.out.println("Low3 :"+low3);
		extractCodeElems(low2);
		System.out.println("Low2 :"+low2);
		extractCodeElems(low1);
		System.out.println("Low1 :"+low1);
	}
	
	protected void getExtremePost(int answerID)
	{
		extractCodeElems(answerID);
	}
	
	protected void extractCodeElems(int answerID)
	{
		//extract code elements
		String questionFolder=StaticData.SOPostData+"/codes/"+this.postID;
		File dir=new File(questionFolder);
		if(!dir.exists())dir.mkdir();
		//saving the post
		String ansPostSrc=StaticData.SOPostData+"/posts/"+answerID+".txt";
		String htmlContent=ContentLoader.loadFileContent(ansPostSrc);
		Document doc=Jsoup.parse(htmlContent);
		Elements elems=doc.select("code");
		String codeStr=new String();
		for(Element elem:elems)
		{
			codeStr+=elem.text()+"\n";
		}
		//saving the document
		String ansfileName=StaticData.SOPostData+"/codes/"+this.postID+"/"+answerID+".txt";
		ContentSaver.saveFile(codeStr, ansfileName);
		//System.out.println("Saved :"+answerID);
	}
	
	public static void main(String[] args){
		int postID=16143562;
		CodeFragSelector cfselector=new CodeFragSelector(postID);
		cfselector.getExtremePosts();
		//int answerID=9148893;
		//cfselector.getExtremePost(answerID);
	}
}
