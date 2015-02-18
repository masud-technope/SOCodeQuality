package qstans;

import java.io.File;
import java.util.Scanner;

import extractor.StaticData;

public class SOCFSize {

	/**
	 * @param args
	 */
	protected static void getAverageCodeFragmentSize()
	{
		//code for getting average code fragment size
		String data=StaticData.Data_Directory+"/answer_formatted";
		int linecount=0;
		int answerCount=0;
		File fDir=new File(data);
		if(fDir.isDirectory()){
			File[] files=fDir.listFiles();
			for(File f1:files){
				if(f1.isDirectory()){
					File[] files2=f1.listFiles();
					for(File f2:files2){
						try
						{
						Scanner scanner=new Scanner(f2);
						while(scanner.hasNext()){
							String line=scanner.nextLine();
							if(!line.trim().isEmpty())linecount++;
						}
						}catch(Exception exc){}
					}
					answerCount+=files2.length;
				}
			}
		}
		System.out.println("Average line per code example:"+ ((double)linecount)/answerCount );
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAverageCodeFragmentSize();
	}

}
