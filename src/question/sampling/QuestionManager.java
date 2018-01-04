package question.sampling;

import java.io.File;
import config.StaticData;

public class QuestionManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codeFolder = StaticData.EXP_HOME + "/ICSE2015Data/codes";
		File dir = new File(codeFolder);
		if (dir.isDirectory()) {
			String[] files = dir.list();
			for (String file : files) {
				System.out.println(file.split("\\.")[0]+",");
			}
		}
	}
}
