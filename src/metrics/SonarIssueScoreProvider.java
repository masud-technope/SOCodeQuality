package metrics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import extractor.StaticData;

public class SonarIssueScoreProvider {

	/**
	 * @param args
	 */
	static HashMap<Integer,Double> sonarIssue=new HashMap<>();
	
	protected static int getSLOC(int postID)
	{
		//code for getting SLOC
		int SLOC=0;
		try
		{
			String fileName=StaticData.Data_Directory+"/codefrags/F"+postID+".java";
			Scanner scanner=new Scanner(new File(fileName));
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				if(line.startsWith("//"))continue;
				if(line.trim().isEmpty())continue;
				if(line.startsWith("/*") || line.startsWith("*/"))continue;
				SLOC++;
			}
		}catch(Exception exc){}
		return SLOC;
	}
	
	protected static void loadSonarScores()
	{
		//code for loading the scores
		String commen2=StaticData.Data_Directory+"/sonarIssue.txt";
		File f=new File(commen2);
		try {
			Scanner scanner = new Scanner(f);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String parts[] = line.split("\\s+");
				int postID=Integer.parseInt(parts[0].trim().substring(1));
				int critical=Integer.parseInt(parts[1].trim());
				int major=Integer.parseInt(parts[2].trim());
				int minor=Integer.parseInt(parts[3].trim());
				double critical_weight=1; //needs training
				double major_weight=.8; //needs training
				double minor_weight=.5; //needs training
				double issue_score=critical_weight*critical+major_weight*major+minor_weight*minor;
				int SLOC=getSLOC(postID);
				
				if(SLOC==0)SLOC=15; //in case SLOC can't be determined
				
				sonarIssue.put(postID, issue_score/SLOC);
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static double getSonarIssueScore(int postID)
	{
		if(sonarIssue.isEmpty())
			loadSonarScores();
			//code for getting comment based scores
		double sonar_score=0;
			if(sonarIssue.containsKey(postID)){
				sonar_score=sonarIssue.get(postID).doubleValue();
			}
		return sonar_score;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
