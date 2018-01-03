package qstans;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuestionAnswerTest {

	/**
	 * @param args
	 */
	
	protected static void get_question_answer_pairs()
	{
		//code for getting the question answer pair
		try
		{
			String myfile="C:/MyWorks/Dataset/SOPost/qstans/qa.txt";
			String myfile2="C:/MyWorks/Dataset/SOPost/qstans/qa2.txt";
			FileWriter writer=new FileWriter(new File(myfile2));
			Scanner scanner=new Scanner(new File(myfile));
			String myline=new String();
			int prev_father=0;
			while(scanner.hasNext())
			{
				String line=scanner.nextLine().trim();
				String[] parts=line.split("\\s+");
				int parent=Integer.parseInt(parts[0]);
				int child=Integer.parseInt(parts[1]);
				
			    if(parent==prev_father)
			    {
			    	myline+=" "+child;
			    }else
			    {
			    	if(!myline.isEmpty())
			    	writer.write(myline+"\n");
			    	myline=parent+" "+child;
			    }
			    prev_father=parent;
			}
			writer.write(myline);
			writer.close();
			System.out.println("Operation completed successfully.");
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	protected void filter_code_fragment_list()
	{
		//code for filtering the code fragments
		try
		{
			
			
			
			
			
		}catch(Exception exc){
		}
	}
	
	
	protected static boolean check_existence(String fileName,int type)
	{
		//code for checking the file existence
		boolean resp=false;
		try
		{
			String targetFileName="C:/MyWorks/Dataset/SOPost";
			if(type==0)
			targetFileName+="/qfrags1/frag_"+fileName+".java";
			else targetFileName+="/frags1/frag_"+fileName+".java";
			File file=new File(targetFileName);
			if(file.exists())resp=true;
		}catch(Exception exc){}
		return resp;
	}
	
	
	
	protected static void create_question_post(String qpostID)
	{
		//code for creating question post
		try
		{
		String file2="C:/MyWorks/Dataset/SOPost/qstans/questions/frag_"+qpostID+".java";
		String file1="C:/MyWorks/Dataset/SOPost/qfrags1/frag_"+qpostID+".java";
		String qfolder="C:/MyWorks/Dataset/SOPost/qstans/answers/"+qpostID;
		File f=new File(qfolder);
		if(!f.exists())f.mkdir();
		Files.copy(new File(file1).toPath(), new File(file2).toPath());
		}catch(Exception exc){
			//exc.printStackTrace();
		}
	}
	
	protected static void create_answer_post(String qpostID,String apostID)
	{
		//code for creating answer post
		try
		{
		String file2="C:/MyWorks/Dataset/SOPost/qstans/answers/"+qpostID+"/frag_"+apostID+".java";
		String file1="C:/MyWorks/Dataset/SOPost/frags1/frag_"+apostID+".java";
		Files.copy(new File(file1).toPath(), new File(file2).toPath());
		}catch(Exception exc){}
	}
	
	
	protected static void count_code_fragment_post()
	{
		//code for counting the code fragment posts
		String qa3="C:/MyWorks/Dataset/SOPost/qstans/qa3.txt";
		try
		{
			Scanner scanner=new Scanner(new File(qa3));
			HashMap<Integer, ArrayList<Integer>> mymap=new HashMap<>();
			int code_frags=0;
			int distinct_items=0;
			int question_extracted=0;
			int answer_extracted=0;
			int multiple_answers=0;
			int ans_3=0;
			int ans_5=0;
			int ans_10=0;
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				String[] parts=line.split("\\s+");
				
				String qst=parts[0];
				int key=Integer.parseInt(qst);
				
				if(parts.length>1)
				{
					
					if(parts.length>2)multiple_answers++;
					if(parts.length>=4)ans_3++;
					if(parts.length>=6)ans_5++;
					if(parts.length>=11){
						ans_10++;
						System.out.println(key);
						create_question_post(key+"");
					}
					
					ArrayList<Integer> ansList=new ArrayList<>();
					int found=0;
					for(int i=1;i<parts.length;i++)
					{
						if(check_existence(parts[i], 1))
						{
							int ansID=Integer.parseInt(parts[i]);
							ansList.add(ansID);
							answer_extracted++;
							if(parts.length>=11)
							//create_answer_post(key+"", parts[i]);
							found=1;
						}
					}
					if(found==1)
					mymap.put(key, ansList);
				}
			}
			//System.out.println("Question containing codes:"+distinct_items);
			//System.out.println("Code fragment found:"+code_frags);
			//System.out.println("Question extracted:"+question_extracted);
			System.out.println("Question extracted:"+mymap.size());
			System.out.println("Answer extracted:"+answer_extracted);
			System.out.println("Average answer per question:"+(double)answer_extracted/mymap.size());
			System.out.println("Multiple answered questions:"+multiple_answers);
			System.out.println("More than 3:"+ans_3);
			System.out.println("More than 5:"+ans_5);
			System.out.println("More than 10:"+ans_10);
			
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	
	protected static void check_already_extracted()
	{
		//code for checking already extracted
		String qa3="C:/MyWorks/Dataset/SOPost/qstans/qa3.txt";
		try
		{
			
			
			
		}catch(Exception exc){
			
		}	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get_question_answer_pairs();
		count_code_fragment_post();
	}

}
