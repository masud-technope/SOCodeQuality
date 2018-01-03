package extractor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		String fileName=StaticData.SOPostData+"/posts/"+postID+".txt";
		try {
			FileWriter fwriter=new FileWriter(new File(fileName));
			fwriter.write(postcontent);
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void extractEntries()
	{
		//parsing entries from the file
		String content=ContentLoader.loadFileContentSC(this.csvFile);
		String[] entries=content.split("\"\n\"");
		System.out.println("Entries:"+entries.length);
		for(String entry:entries){
			String[] cols=entry.split("\",\"");
			//int postid=Integer.parseInt(cols[0]);
			String body=cols[2];
		}
	}
	
	public static void main(String[] args){
		String csvFile=config.StaticData.EXP_HOME  +"/low-voted-6316.csv";
		CSVReader reader=new CSVReader(csvFile);
		reader.extractEntries();
	}
}
