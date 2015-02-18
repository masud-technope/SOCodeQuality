package qstans;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import extractor.StaticData;

public class VoteCollector {

	/**
	 * @param args
	 */

	
	protected static int getUpVotes(int postID)
	{
		//code for getting up votes
		int upVote=0;
		try
		{
			Class.forName(StaticData.Driver_name).newInstance();
			Connection conn=DriverManager.getConnection(StaticData.connectionString);
			String get_vote_and_day="SELECT count(*) as upvotes from Vote where VoteTypeID<3 and PostID="+postID;
			Statement stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery(get_vote_and_day);
			while(result.next())
			{
				upVote=Integer.parseInt(result.getString("upvotes"));
				break;
			}
		    }catch(Exception exc)
		    {
		    	exc.printStackTrace();
		    }
		return upVote;
	}
	
	protected static int getDownVotes(int postID)
	{
		//code for getting up votes
		int downVote=0;
		try
		{
			Class.forName(StaticData.Driver_name).newInstance();
			Connection conn=DriverManager.getConnection(StaticData.connectionString);
			String get_vote_and_day="SELECT count(*) as downvotes from Vote where VoteTypeID=3 and PostID="+postID;
			Statement stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery(get_vote_and_day);
			while(result.next())
			{
				downVote=Integer.parseInt(result.getString("downvotes"));
				break;
			}
		    }catch(Exception exc)
		    {
		    	exc.printStackTrace();
		    }
		return downVote;
	}
	
	
	protected static double get_answer_post_vote(int postID)
	{
		// code for getting vote
		double total_score = 0;
		int total_interval = 0;
		try {
			Class.forName(StaticData.Driver_name).newInstance();
			Connection conn = DriverManager
					.getConnection(StaticData.connectionString);
			String get_vote_and_day = "SELECT DATEDIFF(day,CreationDate, '2011-01-13') as dateInterval, Score from Post where PostID="
					+ postID;
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(get_vote_and_day);
			while (result.next()) {
				total_interval = Integer.parseInt(result
						.getString("dateInterval"));
				total_score = Double.parseDouble(result.getString("Score"));
				break;
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		//double downVotes = getDownVotes(postID);
		//double upVotes = getUpVotes(postID);
		//return (total_score/(upVotes+downVotes)) / total_interval;
		total_interval++;
		return total_score/total_interval;
	}
	
	
	
	protected static void get_code_fragment_list()
	{
		String folder=StaticData.Data_Directory+"/extremedata";
		String file0=StaticData.Data_Directory+"/qa5_5_max_min_id.txt";
		File f=new File(folder);
		if(f.isDirectory())
		{
			File[] files=f.listFiles();
			String totalOutput=new String();
			try
			{
			FileWriter writer=new FileWriter(new File(file0));
			for(File f2:files)
			{
				String quest=f2.getName();
				if(f2.isDirectory()) //question dir
				{
					File[] files2=f2.listFiles();
					double max_score=0;
					int max_postID=0;
					double min_score=1000000;
					int min_postID=0;
					for(File f3:files2)
					{
						int postID=Integer.parseInt(f3.getName().split("\\.")[0].split("_")[1]);
						//quest+="\t"+postID;
						double cscore=get_answer_post_vote(postID);
						if(cscore>max_score){
							max_score=cscore;
							max_postID=postID;
						}
						if(cscore<=min_score){
							min_score=cscore;
							min_postID=postID;
						}
						//quest+=":"+cscore;
					}
					//writer.write( quest+" "+min_postID+":"+min_score+"\t"+ max_postID+":"+max_score+"\n");
					//writer.write( quest+"\t"+ max_postID+":"+max_score+"\t"+min_postID+":"+min_score+"\n");
					writer.write( quest+"\t"+ max_postID+"\t"+min_postID+"\n");
				}
			}
			//writer.write(totalOutput);
			writer.close();
			}catch(Exception exc){}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_code_fragment_list();

	}

}
