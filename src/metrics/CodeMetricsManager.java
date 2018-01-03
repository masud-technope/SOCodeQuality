package metrics;

import java.io.File;
import java.util.Scanner;
import extractor.StaticData;

public class CodeMetricsManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try
         {
         String codeFile=StaticData.Data_Directory+"/answer_formatted";
         File f=new File(codeFile);
         if(f.isDirectory()){
        	 File[] files=f.listFiles();
        	 for(File f2:files){
        		 System.out.println(f2.getName());
        		 System.out.println("------------");
        		 if(f2.isDirectory()){
        		 File[] codeFiles=f2.listFiles();
        		 for(File f3:codeFiles){
        			 
        			  Scanner scanner=new Scanner(f3);
        		         String code=new String();
        		         while(scanner.hasNext())
        		         {
        		        	String line=scanner.nextLine();
        		        	code+=line+"\n";
        		         }
        		         scanner.close();
        		         double readability_score=ReadabilityProvider.get_readability_score(code);
        				 System.out.println(f3.getName()+": Readability score:"+readability_score);
        				 int postID=Integer.parseInt(f3.getName().split("\\.")[0].split("_")[1]);
        				 double norm_reputation=AuthorReputationProvider.get_author_normalized_reputation(postID);
        				 System.out.println("Author normalized reputation:"+norm_reputation);
        				 	 
        		 }
        		 System.out.println("================");
        		 
        		 }
        		 
        	 }
        	 
         }
         }catch(Exception exc){}

	}

}
