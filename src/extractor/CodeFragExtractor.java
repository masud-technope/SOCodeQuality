package extractor;

import java.io.File;
import java.io.FileWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import config.StaticData;
import utility.ContentLoader;

public class CodeFragExtractor {

	String csvFile;

	public CodeFragExtractor(String csvFile) {
		this.csvFile = csvFile;
	}

	protected void extractCF() {
		// extracting code fragments
		String contentHTML = ContentLoader.loadFileContent(this.csvFile);
		Document document = Jsoup.parse(contentHTML);
		Elements codes = document.select("code");
		System.out.println("Items found:"+codes.size());
		for (Element elem : codes) {
			//System.out.println(elem.text());
			//System.out.println("========================");
			//saveFragments(elem.text());
		}
	}
	
	protected void extractCF2()
	{
		//extracting code fragments
		String contentHTML = ContentLoader.loadFileContentSC(this.csvFile);
		//contentHTML=contentHTML.replaceAll("\"\"", "\"");
		String[] entries=contentHTML.split("\"\n\"");
		System.out.println("Items found:"+entries.length);
		for(String entry:entries){
			String[] parts=entry.split(",");
			String postid=parts[0];
			Document document = Jsoup.parse(entry);
			Elements codes = document.select("pre");
			String codecontent=new String();
			for(Element elem:codes){
				codecontent+=elem.text()+"\n";
			}
			//codecontent=postid+"\n"+codecontent;
			//saveFragments(codecontent);
		}
	}
	
	protected void extractCF3(){
		//extracting code fragments
		String contentHTML = ContentLoader.loadFileContentSC(this.csvFile);
		Document document = Jsoup.parse(contentHTML);
		Elements codes = document.select("code");
		System.out.println("Total fragment found:"+codes.size());
		int eligiblecode=0;
		for(Element elem:codes){
			String code=elem.text();
			if(code.split("\n").length>=3){
				eligiblecode++;
				saveFragments(eligiblecode+".txt", code);
			}
		}
		System.out.println("Eligible code:"+eligiblecode);
	}
	
	
	protected void saveFragments(String fileName, String code) {
		try {
			String outFile = StaticData.EXP_HOME + "/low/"+fileName;
			FileWriter fwriter = new FileWriter(new File(outFile));
			fwriter.write(code);
			//fwriter.write("=======================");
			fwriter.close();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String csvFile = StaticData.EXP_HOME + "/low-voted-res.txt";
		CodeFragExtractor cfExtractor = new CodeFragExtractor(csvFile);
		cfExtractor.extractCF3();
		System.out.println("Done.");
	}
}
