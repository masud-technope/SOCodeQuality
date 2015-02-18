package documethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import extractor.StaticData;

public class PostIDManager {
	
	protected void postIDFileMaker()
	{
		String questionFile=StaticData.SOPostData+"/questions.csv";
		String questionf=StaticData.SOPostData+"/questions2.txt";
		try {
			FileWriter fwriter=new FileWriter(new File(questionf));
			Scanner scanner=new Scanner(new File(questionFile));
			while(scanner.hasNext()){
				String line=scanner.nextLine();
				String id=line.substring(1,line.length()-1);
				fwriter.write(id+",\n");
			}
			scanner.close();
			fwriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String statfile=StaticData.SOPostData+"/post-author-editor.txt";
		try{
		Scanner scanner=new Scanner(new File(statfile));
		HashSet<Integer> questionSet=new HashSet<>();
		while(scanner.hasNext()){
			String line=scanner.nextLine();
			int postID=Integer.parseInt(line.split("\\s+")[0].trim());
			questionSet.add(postID);
		}
		scanner.close();
		ArrayList<Integer> list=new ArrayList<>(questionSet);
		Collections.sort(list);
		for(int id:list){
			System.out.println(id);
		}
		}catch(Exception e){
			//handle the exception
		}
	}
}
