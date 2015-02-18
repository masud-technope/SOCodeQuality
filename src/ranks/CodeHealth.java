package ranks;

import java.io.File;
import java.util.Scanner;
import extractor.StaticData;

public class CodeHealth {
	public double positiveAspect;
	public double negativeAspect;
	public double totalAspect;
	
	public static int getSourceLOC(int questionID, int postID) {
		// code for getting SLOC
		int sloc = 0;
		String codeFile = StaticData.Data_Directory + "/extremedata/" + questionID
				+ "/frag_" + postID + ".java";
		try {
			Scanner scanner = new Scanner(new File(codeFile));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				if (line.startsWith("//"))
					continue;
				if (line.trim().isEmpty())
					continue;
				if (line.startsWith("/*") || line.startsWith("*/"))
					continue;
				sloc++;
			}
		} catch (Exception exc) {
		}
		return sloc;
	}
}
