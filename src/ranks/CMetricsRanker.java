package ranks;

import java.io.File;
import java.util.Scanner;

import extractor.StaticData;
import metrics.MyCodeMetricsRankManager;

public class CMetricsRanker {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCodeMetricsRankManager manager=new MyCodeMetricsRankManager();
		manager.get_code_metrics_ranks();
		String qa_52=StaticData.Data_Directory+"/qa5_2.txt";
		File f=new File(qa_52);
		try
		{
			RankMatcher rmatcher=new RankMatcher();
			Scanner scanner=new Scanner(f);
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				int postID=Integer.parseInt(line.split("\\s+")[0]);
				rmatcher.match_post_ranks(postID);
			}
			scanner.close();
		}catch(Exception exc){
		}
		
		//now check the agreement
		new ResultAgreementChecker().get_result_correlation();
		
	}

}
