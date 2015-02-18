package utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ContentSaver {
	public static void saveFile(String content, String fileName){
		try {
			FileWriter fwriter=new FileWriter(new File(fileName));
			fwriter.write(content);
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
