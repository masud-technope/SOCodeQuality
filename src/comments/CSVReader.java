package comments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import extractor.StaticData;
import utility.ContentLoader;

public class CSVReader {
	
	String csvFile;
	public CSVReader(String csvFile)
	{
		//initialization
		this.csvFile=csvFile;
	}
	
	protected String loadFileContent()
	{
		//loading file content
		String content=new String();
		try {
			BufferedReader breader=new BufferedReader(new FileReader(new File(this.csvFile)));
			int val=0;
			while(breader.read()!=-1){
				char c=(char)val;
				content+=c;
			}
			breader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CSV File loaded");
		return content;
	}
	
	protected void savePost(int postID, String postcontent){
		//saving SO posts
		String fileName=StaticData.SOPostData+"/vcomments/"+postID+".txt";
		try {
			FileWriter fwriter=new FileWriter(new File(fileName),true);
			fwriter.write(postcontent+"\n");
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void extractEntries()
	{
		//parsing entries from the file
		String content=ContentLoader.loadFileContent(this.csvFile);
		String[] entries=content.split("\"\n\"");
		System.out.println("Entries:"+entries.length);
		for(String entry:entries){
			String[] cols=entry.split("\",\"");
			System.out.println(cols[0]+" "+cols[1]+" "+cols[2]+" ");
			int postID=Integer.parseInt(cols[0].trim());
			int commentID=Integer.parseInt(cols[1].trim());
			int score=Integer.parseInt(cols[2].trim());
			String textcontent=cols[3];
			if(score>0){
			String mycontent=textcontent;
			savePost(postID, mycontent);
			}
		}
	}
	
	public static void main(String[] args){
		String csvFile=StaticData.SOPostData+"/comments.csv";
		CSVReader reader=new CSVReader(csvFile);
		reader.extractEntries();
	}
}
