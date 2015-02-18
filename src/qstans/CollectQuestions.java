package qstans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import extractor.StaticData;

public class CollectQuestions {

	/**
	 * @param args
	 */
	
	protected static String getQuestionTitle(int postID)
	{
		String questionTitle=new String();
		try
		{
			Class.forName(StaticData.Driver_name).newInstance();
			Connection conn=DriverManager.getConnection(StaticData.connectionString);
			String get_title="select Title from Post where PostID="+postID;
			Statement stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery(get_title);
			while(result.next())
			{
				questionTitle=result.getString("Title");
				break;
			}
		}catch(Exception ex){
			//handle th exception
		}
		return questionTitle;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codemetrank=StaticData.Data_Directory+"/codemetrank_all.txt";
		String questions=StaticData.Data_Directory+"/question.txt";
		try{
		FileWriter fwriter=new FileWriter(new File(questions));
		File f=new File(codemetrank);
		try {
			Scanner scanner=new Scanner(f);
			while(scanner.hasNext()){
				String line=scanner.nextLine();
				int questionID=Integer.parseInt(line.split("\\s+")[0]);
				String title=getQuestionTitle(questionID);
				fwriter.write(questionID+"\t"+title+"\n");
			}
			fwriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}catch(Exception exc){}
		
		
	}

}
