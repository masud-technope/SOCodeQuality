package metrics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import extractor.StaticData;

public class CommentCollector {

	/**
	 * @param args
	 */
	
	
	public CommentCollector()
	{
		//default constructor
	}
	
	
	protected String getTheCode(int questionID,int postID)
	{
		//code for getting the source code
		String code=new String();
		String extremedata=StaticData.Data_Directory+"/extremedata";
		String postFile=extremedata+"/"+questionID+"/frag_"+postID+".java";
		File f=new File(postFile);
		try {
			Scanner scanner=new Scanner(new File(postFile));
			while(scanner.hasNext()){
				code+=scanner.nextLine()+"\n";
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return code;
	}
	
	
	protected String collectComments(int postID)
	{
		//code for collecting comments
		String comments=new String();
		try
	    {
		//code for adding a new badge entry
		Class.forName(StaticData.Driver_name).newInstance();
		Connection conn=DriverManager.getConnection(StaticData.connectionString);
		String getComments="SELECT Score, Text from Comment where PostID="+postID;
		Statement stmt=conn.createStatement();
		ResultSet result=stmt.executeQuery(getComments);
		while(result.next())
		{
			int score=result.getInt("Score");
			String commentText=result.getString("Text");
			String line=score+"\t"+commentText;
			comments+=line+"\n";
		}
	    }catch(Exception exc)
	    {	exc.printStackTrace();
	    	
	    }
		return comments;
	}
	
	protected void saveTheFile(String filePath, String content)
	{
		try
		{
			File f=new File(filePath);
			FileWriter fwrier=new FileWriter(f);
			fwrier.write(content);
			fwrier.close();
		}catch(Exception exc){
			
		}	
	}
	
	protected void recordCommentCounts(String filePath, String content)
	{
		//code for saving comment count
		File f=new File(filePath);
		try {
			FileWriter fwriter=new FileWriter(f);
			fwriter.write(content);
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected void collect_comments_for_single_posts(int questionID, int postID)
	{
		String code=getTheCode(questionID, postID);
		String  comments=collectComments(postID);
		String commentFolder=StaticData.Data_Directory+"/comment";
		String filePath2=commentFolder+"/"+questionID+"/frag_"+postID+".txt";
		String content2=code+"\n\nComments:\n"+comments;
		saveTheFile(filePath2, content2);
		System.out.println("Comments saved successfully.");
	}
	
	
	protected void manage_comment_collections()
	{
		//code for managing comment collection
		String q5max_min=StaticData.Data_Directory+"/qa5_5_max_min_id.txt";
		String commentFolder=StaticData.Data_Directory+"/comment";
		String commentCount=StaticData.Data_Directory+"/commentcount.txt";
		
		
		File f2=new File(q5max_min);
		try {
			FileWriter cwriter=new FileWriter(new File(commentCount));
			Scanner scanner=new Scanner(f2);
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				String[] parts=line.split("\\s+");
				int questionID=Integer.parseInt(parts[0]);
				int maxID=Integer.parseInt(parts[1]);
				int minID=Integer.parseInt(parts[2]);
				File questionFile=new File(commentFolder+"/"+questionID);
				if(!questionFile.exists())questionFile.mkdir();
				String code1=getTheCode(questionID, maxID);
				String comment1=collectComments(maxID);
				String filePath1=commentFolder+"/"+questionID+"/frag_"+maxID+".txt";
				String content1=code1+"\n\nComments:\n"+comment1;
				//saveTheFile(filePath1, content1);
				
				String code2=getTheCode(questionID, minID);
				String comment2=collectComments(minID);
				String filePath2=commentFolder+"/"+questionID+"/frag_"+minID+".txt";
				String content2=code2+"\n\nComments:\n"+comment2;
				//saveTheFile(filePath2, content2);
				
				String cline=questionID+"\t"+maxID+":"+comment1.split("\n").length+"\t"+minID+":"+comment2.split("\n").length+"\n";
				cwriter.write(cline);
			}
			cwriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException exc){}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new CommentCollector().manage_comment_collections(); //	collectComments(3076150);
		int questionID=40480;
		int postID=73021;
		new CommentCollector().collect_comments_for_single_posts(questionID, postID);
		
	}

}
