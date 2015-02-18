package qstans;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilterAnswer {

	/**
	 * @param args
	 */
	
	protected static boolean contain_code_snippet(File f)
	{
		boolean resp=false;
		try {
			int count_lines=0;
			Scanner scanner=new Scanner(f);
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				if(!line.trim().isEmpty())count_lines++;
			}
			if(count_lines>=5)resp=true;
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folder="C:/MyWorks/Dataset/SOPost/qstans/answwer_filtered";
		File f=new File(folder);
		File[] files=f.listFiles();
		int deleted=0;
		int total_item=0;
		for(File f2:files)
		{
			if(f2.isDirectory())
			{
				File[] files2=f2.listFiles();
				for(File f3:files2)
				{
					boolean eligible=contain_code_snippet(f3);
					total_item++;
					if(!eligible)
					{
						f3.delete();
						deleted++;
					}
				}
			}
		}
		System.out.println("Total items:"+total_item);
		System.out.println("File deleted:"+deleted);
	}

}
