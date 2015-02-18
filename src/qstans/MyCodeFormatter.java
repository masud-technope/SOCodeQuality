package qstans;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MyCodeFormatter {

	/**
	 * @param args
	 */
	protected static void format_and_save_code(int questionID, File f)
	{
		//code for formatting and saving the code
		try
		{
			Scanner scanner=new Scanner(f);
			String code=new String();
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				code+=line+"\n";
			}
			scanner.close();
			
			String code1=code.replaceAll("&lt;", "<");
			String code2=code1.replaceAll("&gt;", ">");
			String code3=code2.replaceAll("&amp;", "&");
			
			//now write to the file
			String outFolder="C:/MyWorks/Dataset/SOPost/qstans/answer_formatted/"+questionID;
			File fold=new File(outFolder);
			if(!fold.exists())fold.mkdir();
			
			String myOutput=outFolder+"/"+f.getName();
			FileWriter writer=new FileWriter(myOutput);
			writer.write(code3);
			writer.close();
			System.out.println("Fomatted:"+f.getName());
	
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcFolder="C:/MyWorks/Dataset/SOPost/qstans/answwer_filtered";
		File f=new File(srcFolder);
		if(f.isDirectory())
		{
			File[] files=f.listFiles();
			for(File f2:files)
			{
				File[] files2=f2.listFiles();
				int questionID=Integer.parseInt(f2.getName());
				for(File f3:files2)
				{
					format_and_save_code(questionID, f3);
				}
			}
		}
	}

}
