package identifier.semantics;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.commons.lang.StringUtils;
import config.StaticData;
import utility.ContentLoader;

public class IdentifierSemanticsProvider {

	ArrayList<String> stopwords;

	static final String keywords[] = { "abstract", "assert", "boolean",
			"break", "byte", "case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else", "extends", "false",
			"final", "finally", "float", "for", "goto", "if", "implements",
			"import", "instanceof", "int", "interface", "long", "native",
			"new", "null", "package", "private", "protected", "public",
			"return", "short", "static", "strictfp", "super", "switch",
			"synchronized", "this", "throw", "throws", "transient", "true",
			"try", "void", "volatile", "while" };

	public IdentifierSemanticsProvider() {
		this.stopwords = new ArrayList<>();
		this.loadStopWords();
	}

	protected void loadStopWords() {
		// loading stop words in the list
		String stopFile = "./stopword/en.txt";
		String[] lines = ContentLoader.getAllLines(stopFile);
		for (String line : lines) {
			this.stopwords.add(line.trim());
		}
	}

	protected HashSet<String> tokenizeCode(String code) {
		// tokenize a code fragment
		HashSet<String> vocabulary = new HashSet<>();
		String regex = "\\p{Punct}+|\\s+";
		String[] tokens = code.split(regex);
		for (String token : tokens) {
			if(isKeyword(token))continue; //discarding the keywords
			String[] identifierWords = StringUtils
					.splitByCharacterTypeCamelCase(token);
			for (String word : identifierWords) {
				vocabulary.add(word);
			}
		}
		return vocabulary;
	}

	protected boolean isKeyword(String token) {
		boolean response = false;
		for (String keyword : keywords) {
			if (keyword.equals(token)) {
				response = true;
				break;
			}
		}
		return response;
	}

	public double getLowSemantics(String code) {
		HashSet<String> tokens = tokenizeCode(code);
		HashSet<String> stops = new HashSet<>();
		for (String token : tokens) {
			//if(isKeyword(token))continue;
			if (this.stopwords.contains(token)) {
				stops.add(token);
			} else if (token.length() < 2) {
				stops.add(token);
			}
		}
		// return ratio of low semantic words
		return (double) stops.size() / tokens.size();
	}

	protected void collectLowSemanticWordRatio() {
		// collecting low semantic word ratio
		try {
			String codeFolder = StaticData.EXP_HOME + "/low";
			File outFile = new File(StaticData.EXP_HOME
					+ "/metrics/low-semantic.txt");
			File dir = new File(codeFolder);
			if (dir.isDirectory()) {
				File[] codeFiles = dir.listFiles();
				FileWriter writer = new FileWriter(outFile);
				for (File f : codeFiles) {
					String code = ContentLoader.loadFileContentSC(f.getAbsolutePath());
					double lowsemantic = getLowSemantics(code);
					writer.write(lowsemantic + "\n");
					System.out.println(f.getName() + " " + lowsemantic);
				}
				writer.close();
				System.out.println("Low semantic ratio saved.");
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	protected void testCode() {
		String codeFile = StaticData.EXP_HOME + "/high/1982.txt";
		String code = ContentLoader.loadFileContentSC(codeFile);
		double sem = getLowSemantics(code);
		System.out.println(sem);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IdentifierSemanticsProvider().collectLowSemanticWordRatio();
		// new IdentifierSemanticsProvider().testCode();
	}
}
