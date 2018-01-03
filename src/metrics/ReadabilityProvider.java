package metrics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import extractor.StaticData;

public class ReadabilityProvider {

	/**
	 * @param args
	 */
	public static double get_readability_score(String codeFragment)
	{
		//code for providing readability score
		return raykernel.apps.readability.eval.Main.getReadability(codeFragment);
		//return new HealsteadComplexityProvider(codeFragment).getHalsteadReadabilityScore();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName=StaticData.Data_Directory+"/data/4125762";
		File f=new File(fileName);
		if(f.isDirectory())
		{
			File[] myfiles=f.listFiles();
			for(File f2:myfiles)
			{
				String code=new String();
				try {
					Scanner scanner=new Scanner(f2);
					while(scanner.hasNext())
					{
						String line=scanner.nextLine();
						code+=line+"\n";
					}
					scanner.close();
					double readability=ReadabilityProvider.get_readability_score(code);
					//double readability=new HealsteadComplexityProvider(code).getHalsteadReadabilityScore();
					System.out.println(f2.getName()+":"+readability);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
