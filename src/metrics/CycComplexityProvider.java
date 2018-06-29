package metrics;

import java.io.File;
import java.io.FileWriter;
import java.util.StringTokenizer;
import utility.ContentLoader;
import config.StaticData;

public class CycComplexityProvider {

	public CycComplexityProvider() {
		// default constructor
	}

	protected int getCComplexity(String code) {
		// collecting cyclomatic complexity from a code
		int ccomplexity = 0;
		String[] keywords = { "if", "else", "while", "case", "for", "switch",
				"do", "continue", "break", "&&", "||", "?", ":", "catch",
				"finally", "throw", "throws", "default", "return", "foreach",
				"elseif", "or", "and", "xor" };
		StringTokenizer tokenizer = new StringTokenizer(code);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			for (String keyword : keywords) {
				if (keyword.equals("\\"))
					break;
				else if (keyword.equals(token)) {
					ccomplexity++;
				}
			}
		}
		return ccomplexity;
	}
	
	protected void collectCyclomaticComplexity()
	{
		try{
			String codeFolder=StaticData.EXP_HOME+"/low";
			File outFile=new File(StaticData.EXP_HOME+"/metrics/low-ccomplexity2.txt");
			File dir=new File(codeFolder);
			if(dir.isDirectory()){
				File[] codeFiles=dir.listFiles();
				FileWriter writer=new FileWriter(outFile);
				for(File f:codeFiles){
					String code=ContentLoader.loadFileContentSC(f.getAbsolutePath());
					int ccomplexity=getCComplexity(code);
					writer.write(ccomplexity+"\n");
					System.out.println(ccomplexity);
				}
				writer.close();
				System.out.println("Cyclomatic complexity saved.");
			}
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		new CycComplexityProvider().collectCyclomaticComplexity();
	}
}
