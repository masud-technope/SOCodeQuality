package metrics;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import extractor.StaticData;

public class AuthorReputationProvider {

	/**
	 * @param args
	 */
	
	protected static double get_author_normalized_reputation(int postID)
	{
		// code for getting normalized reputation
		double max_reputation = 120193; //calculated now; 256718; //this is the maxium reputation
		
		double reputation = 0;
		int no_of_person=0;
		try {
			// code for adding a new badge entry
			Class.forName(StaticData.Driver_name).newInstance();
			Connection conn = DriverManager
					.getConnection(StaticData.connectionString); //Post.LastEditorUserID =[User].UserID
			String get_author_reputation = "SELECT Reputation from [User],Post where (Post.OwnerUserId=[User].UserID or Post.LastEditorUserID =[User].UserID) and Post.PostID="
					+ postID;
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(get_author_reputation);
			while (result.next()) {
				reputation+= Double.parseDouble(result.getString("Reputation"));
				no_of_person++;
				
			}
		} catch (Exception exc) {
		}
		//System.out.println("No of person:"+no_of_person);
		if(no_of_person==0) return 0;
		
		double average_reputation=reputation/no_of_person;
		return average_reputation/max_reputation;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int postID=169;
		// System.out.println("Author normalized reputation: "+get_author_normalized_reputation(postID));
		String authScor = StaticData.Data_Directory + "/authorscore.txt";
		String FIDFile = StaticData.Data_Directory + "/postid.txt";
		try {
			FileWriter fwriter = new FileWriter(new File(authScor));
			Scanner scanner = new Scanner(new File(FIDFile));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				int postID = Integer.parseInt(line.trim());
				double authscore = get_author_normalized_reputation(postID);
				fwriter.write(postID + "\t" + authscore+"\n");
			}
			scanner.close();
			fwriter.close();
			System.out.println("Author scores collected successfully.");
		} catch (Exception exc) {
			// handle the exception
		}
	}

}
