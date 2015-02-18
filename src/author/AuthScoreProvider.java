package author;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import extractor.StaticData;

public class AuthScoreProvider {

	HashMap<Integer, Integer> authors;
	HashMap<Integer, Integer> editors;
	HashMap<Integer, Double> normAuthScores;
	HashMap<Integer, Double> postAuthScores;

	public AuthScoreProvider() {
		// default constructor
		this.authors = new HashMap<>();
		this.editors = new HashMap<>();
		this.normAuthScores = new HashMap<>();
		this.postAuthScores = new HashMap<>();
		this.loadAuthorEditors();
		this.loadAuthScores();
	}

	protected void loadAuthorEditors() {
		// loading authors and editors
		String fileName = StaticData.SOPostData + "/post-author-editor.txt";
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNext()) {
				try {
					String line = scanner.nextLine();
					String[] parts = line.split("\\s+");
					int postID = Integer.parseInt(parts[0].trim());
					int authID = Integer.parseInt(parts[1].trim());
					this.authors.put(postID, authID);
					int editorID = Integer.parseInt(parts[2].trim());
					this.editors.put(postID, editorID);
				} catch (Exception e) {
					// handle it
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void loadAuthScores()
	{
		//loading author scores
		String fileName=StaticData.SOPostData+"/authrepu-norm.txt";
		try {
			Scanner scanner=new Scanner(new File(fileName));
			while(scanner.hasNext()){
				String line=scanner.nextLine();
				String[] parts=line.split("\\s+");
				int userID=Integer.parseInt(parts[0].trim());
				double score=Double.parseDouble(parts[1].trim());
				this.normAuthScores.put(userID, score);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void getPostAuthorScores()
	{
		//getting post author scores
		for(int postID:editors.keySet()){
			int authorID=editors.get(postID);
			if(normAuthScores.containsKey(authorID)){
				System.out.println(postID+"\t"+normAuthScores.get(authorID));
			}
		}
	}
	
	public static void main(String[] args){
		AuthScoreProvider provider=new AuthScoreProvider();
		provider.getPostAuthorScores();
	}
}
