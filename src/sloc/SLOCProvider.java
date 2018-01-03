package sloc;
import java.io.File;
import java.io.FileWriter;
import utility.ContentLoader;
import config.StaticData;

public class SLOCProvider {

	public SLOCProvider(){
		//default constructor
	}
	
	public int getSLOC(String filePath)
	{
		return ContentLoader.getAllLines(filePath).length;
	}
	
	protected void collectSLOC()
	{
		//collecting SLOC from code
		try{
			String codeFolder=StaticData.EXP_HOME+"/high";
			File outFile=new File(StaticData.EXP_HOME+"/metrics/high-sloc.txt");
			File dir=new File(codeFolder);
			if(dir.isDirectory()){
				File[] codeFiles=dir.listFiles();
				FileWriter writer=new FileWriter(outFile);
				for(File f:codeFiles){
					//String code=ContentLoader.loadFileContentSC(f.getAbsolutePath());
					int sloc=getSLOC(f.getAbsolutePath());
					writer.write(sloc+"\n");
					System.out.println(sloc);
				}
				writer.close();
				System.out.println("SLOC saved.");
			}
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		new SLOCProvider().collectSLOC();
	}
}
