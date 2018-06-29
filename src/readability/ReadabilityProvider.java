package readability;

import java.io.File;
import java.io.FileWriter;
import config.StaticData;
import utility.ContentLoader;
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
	
	
	protected static void collectSampleReadability()
	{
		String srcFile="F:/MyWorks/Thesis Works/Data_Mining_Works/SO-CodeQuality2018/SCAM2015-Experiment/high/552.txt";
		String code=ContentLoader.loadFileContent(srcFile);
		double read=raykernel.apps.readability.eval.Main.getReadability(code);
		System.out.println(read);
	}
	
	protected void collectReadabilities()
	{
		//collecting readability measures for code fragments
		try{
			String codeFolder=StaticData.EXP_HOME+"/high";
			File outFile=new File(StaticData.EXP_HOME+"/metrics/high-readability.txt");
			File dir=new File(codeFolder);
			if(dir.isDirectory()){
				File[] codeFiles=dir.listFiles();
				FileWriter writer=new FileWriter(outFile);
				for(File f:codeFiles){
					String code=ContentLoader.loadFileContentSC(f.getAbsolutePath());
					double read=get_readability_score(code);
					writer.write(read+"\n");
					System.out.println(read);
				}
				writer.close();
				System.out.println("Readability scores saved.");
			}
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new ReadabilityProvider().collectReadabilities();
		ReadabilityProvider.collectSampleReadability();
	}
}