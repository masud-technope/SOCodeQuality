package exception;

import java.io.File;
import java.io.FileWriter;
import java.util.StringTokenizer;
import utility.ContentLoader;
import config.StaticData;

public class GenExceptionProvider {

	public GenExceptionProvider() {
		// default constructor
	}

	protected int getGenExcepCount(String code) {
		// counting generic exception
		int excepCount = 0;
		StringTokenizer tokenizer = new StringTokenizer(code);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.equals("Exception")) {
				excepCount++;
			}
		}
		return excepCount;
	}

	protected void collectGenericException() {
		// collect generic exception provider
		try {
			String codeFolder = StaticData.EXP_HOME + "/high";
			File outFile = new File(StaticData.EXP_HOME
					+ "/metrics/high-exccount.txt");
			File dir = new File(codeFolder);
			if (dir.isDirectory()) {
				File[] codeFiles = dir.listFiles();
				FileWriter writer = new FileWriter(outFile);
				for (File f : codeFiles) {
					String code = ContentLoader.loadFileContentSC(f
							.getAbsolutePath());
					int exccount = getGenExcepCount(code);
					writer.write(exccount + "\n");
					System.out.println(exccount);
				}
				writer.close();
				System.out.println("ExceptionCount saved.");
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		new GenExceptionProvider().collectGenericException();
	}
}
