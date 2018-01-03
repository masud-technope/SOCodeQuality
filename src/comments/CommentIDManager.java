package comments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import extractor.StaticData;

public class CommentIDManager {
	
	String max_min_file=StaticData.SOPostData+"/max_min_id.txt";
	public CommentIDManager()
	{
		//default constructor
	}
	
	protected void makePostIDList()
	{
		//making post ID list
		try {
			Scanner scanner=new Scanner(new File(max_min_file));
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				String[] parts=line.split("\\s+");
				System.out.println(parts[1]+",");
				System.out.println(parts[2]+",");
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		CommentIDManager manager=new CommentIDManager();
		manager.makePostIDList();
	}
	
	

}
