package extractor;
import utility.ContentLoader;
import config.StaticData;

public class CSVDiagnostics {
	public static void main(String[] args){
		String questionID=StaticData.EXP_HOME+"/temp.txt";
		try{
			String[] lines=ContentLoader.getAllLines(questionID);
			for(String line:lines){
				System.out.println(line+",");
			}
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
}
