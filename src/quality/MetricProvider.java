package quality;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import metrics.ReadabilityProvider;
import utility.ContentLoader;
import extractor.StaticData;

public class MetricProvider {

	HashMap<Integer, Double> authscores;
	HashMap<Integer, Double> editorscores;
	HashMap<Integer, Double> commentscores;
	HashMap<Integer, Double> readabilityscores;
	HashMap<Integer, Double> strength;
	HashMap<Integer, Double> concerns;
	HashMap<Integer, Integer> documentation;
	HashMap<Integer, Integer> completemethod;

	public MetricProvider() {
		// initializing the maps
		this.authscores = new HashMap<>();
		this.editorscores = new HashMap<>();
		this.readabilityscores = new HashMap<>();
		this.strength = new HashMap<>();
		this.concerns = new HashMap<>();
		this.documentation=new HashMap<>();
		this.completemethod=new HashMap<>();
		
		this.loadAuthScores();
		this.loadEditorScores();
		this.loadCommentScores();
		this.loadDocumethods();
	}

	protected void loadAuthScores() {
		// loading author scores
		String fileName = StaticData.SOPostData + "/authscores.txt";
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] parts = line.split("\\s+");
				int postID = Integer.parseInt(parts[0].trim());
				double score = Double.parseDouble(parts[1].trim());
				this.authscores.put(postID, score);
			}
			scanner.close();
			System.out.println("Author score loaded");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void loadEditorScores() {
		// loading author scores
		String fileName = StaticData.SOPostData + "/editorscores.txt";
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] parts = line.split("\\s+");
				int postID = Integer.parseInt(parts[0].trim());
				double score = Double.parseDouble(parts[1].trim());
				this.editorscores.put(postID, score);
			}
			scanner.close();
			System.out.println("Editor score loaded.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void loadCommentScores() {
		// loading author scores
		String fileName = StaticData.SOPostData + "/vcommentscore.txt";
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] parts = line.split("\\s+");
				int postID = Integer.parseInt(parts[0].trim());
				double strong = Double.parseDouble(parts[1].trim());
				double concern = Double.parseDouble(parts[2].trim());
				this.strength.put(postID, strong);
				this.concerns.put(postID, concern);
			}
			scanner.close();
			System.out.println("Comment score loaded.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void loadDocumethods()
	{
		//loading documentation and method existence
		String fileName = StaticData.SOPostData + "/documethod.txt";
		try{
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] parts = line.split("\\s+");
				int postID = Integer.parseInt(parts[0].trim());
				int documentExisted = Integer.parseInt(parts[1].trim());
				int comMethodExisted = Integer.parseInt(parts[2].trim());
				this.documentation.put(postID, documentExisted);
				this.completemethod.put(postID, comMethodExisted);
			}
			scanner.close();
			System.out.println("Documentation and complete method score loaded.");
			
		}catch(Exception exc){
			//handle the exception
		}
		
	}
	
	
	protected void collectReadabilityScores() {
		// collecting readability
		String fileName = StaticData.SOPostData + "/max_min_id.txt";
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] parts = line.split("\\s+");
				int postID = Integer.parseInt(parts[0].trim());
				int ans1ID = Integer.parseInt(parts[1].trim());
				int ans2ID = Integer.parseInt(parts[2].trim());
				try {
					String src1 = StaticData.SOPostData + "/codes/" + postID
							+ "/" + ans1ID + ".txt";
					String code1 = ContentLoader.loadFileContent(src1);
					double readscore1 = ReadabilityProvider
							.get_readability_score(code1);
					this.readabilityscores.put(ans1ID, readscore1);
				} catch (Exception exc) {
				}

				try {
					String src2 = StaticData.SOPostData + "/codes/" + postID
							+ "/" + ans2ID + ".txt";
					String code2 = ContentLoader.loadFileContent(src2);
					double readscore2 = ReadabilityProvider
							.get_readability_score(code2);
					this.readabilityscores.put(ans2ID, readscore2);
				} catch (Exception exc) {
				}
				Thread.sleep(1000);
			}
			scanner.close();
			System.out.println("Readability score loaded");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void getPostScores() {
		// getting post scores
		String fileName = StaticData.SOPostData + "/max_min_id.txt";
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] elems = line.split("\\s+");

				int post1 = Integer.parseInt(elems[1].trim()); // 1
				// now get the scores
				String scoreline1 = new String();
				if (readabilityscores.containsKey(post1)) {
					scoreline1 += readabilityscores.get(post1) + "\t";
				} else
					scoreline1 += 0 + "\t";
				if (authscores.containsKey(post1)) {
					scoreline1 += authscores.get(post1) + "\t";
				} else
					scoreline1 += 0 + "\t";
				if (editorscores.containsKey(post1)) {
					scoreline1 += editorscores.get(post1) + "\t";
				} else
					scoreline1 += 0 + "\t";
				if (strength.containsKey(post1)) {
					scoreline1 += strength.get(post1) + "\t";
				} else
					scoreline1 += 0 + "\t";
				if (concerns.containsKey(post1)) {
					scoreline1 += concerns.get(post1) + "\t";
				} else
					scoreline1 += 0 + "\t";
				if(documentation.containsKey(post1)){
					scoreline1 += documentation.get(post1) + "\t";
				}
				if(completemethod.containsKey(post1)){
					scoreline1 += completemethod.get(post1) + "\t";
				}
				
				
				System.out.println(scoreline1 + "\t" + 1);

				int post2 = Integer.parseInt(elems[2].trim()); // 0
				String scoreline2 = new String();
				if (readabilityscores.containsKey(post2)) {
					scoreline2 += readabilityscores.get(post2) + "\t";
				} else
					scoreline2 += 0 + "\t";
				if (authscores.containsKey(post2)) {
					scoreline2 += authscores.get(post2) + "\t";
				} else
					scoreline2 += 0 + "\t";
				if (editorscores.containsKey(post2)) {
					scoreline2 += editorscores.get(post2) + "\t";
				} else
					scoreline2 += 0 + "\t";
				if (strength.containsKey(post2)) {
					scoreline2 += strength.get(post2) + "\t";
				} else
					scoreline2 += 0 + "\t";
				if (concerns.containsKey(post2)) {
					scoreline2 += concerns.get(post2) + "\t";
				} else
					scoreline2 += 0 + "\t";
				if(documentation.containsKey(post2)){
					scoreline2 += documentation.get(post2) + "\t";
				}
				if(completemethod.containsKey(post2)){
					scoreline2 += completemethod.get(post2) + "\t";
				}
				
				System.out.println(scoreline2 + "\t" + 0);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MetricProvider provider = new MetricProvider();
		provider.collectReadabilityScores();
		provider.getPostScores();
	}
}
