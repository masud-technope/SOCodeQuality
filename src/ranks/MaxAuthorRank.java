package ranks;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import extractor.StaticData;

public class MaxAuthorRank {

	/**
	 * @param args
	 */
	protected static int getAuthorRank(int postID)
	{
		//code for getting author rank
		int authorRank=0;
		int max_rank=0;
		try
		{
			Class.forName(StaticData.Driver_name).newInstance();
			Connection conn=DriverManager.getConnection(StaticData.connectionString);
			String getAuthorRank="select Reputation from [User], Post where (Post.OwnerUserId=[User].UserID or Post.LastEditorUserID=[User].UserID) and Post.PostID="+postID;
			Statement stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery(getAuthorRank);
			while(result.next())
			{
				authorRank=result.getInt("Reputation");
				if(authorRank>max_rank){
					max_rank=authorRank;
				}
				
			}
		}catch(Exception exc){}
		return max_rank;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String maxmin=StaticData.Data_Directory+"/max_min_id.txt";
		File f=new File(maxmin);
		int max_author_rank=0;
		try
		{
			Scanner scanner=new Scanner(f);
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				String[] parts=line.split("\\s+");
				for(String part:parts){
					int postID=Integer.parseInt(part.trim());
					int authrank=getAuthorRank(postID);
					if(authrank>max_author_rank)
					max_author_rank=authrank;
				}
			}
		}catch(Exception exc){
			
		}
		System.out.println("Maximum author rank:"+max_author_rank);
	}

}
