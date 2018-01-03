package author;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import extractor.StaticData;

public class AuthorIDMgr {
	
	
	protected void makeAuthorList()
	{
		//making distinct author list
		String authorfile=StaticData.SOPostData+"/post-author-editor.txt";
		HashSet<Integer> userset=new HashSet<>();
		try {
			Scanner scanner=new Scanner(new File(authorfile));
			while(scanner.hasNextLine()){
				String line=scanner.nextLine();
				String[] parts=line.split("\\s+");
				try{
					int author=Integer.parseInt(parts[1].trim());
					userset.add(author);
					int editor=Integer.parseInt(parts[2].trim());
					userset.add(editor);
				}catch(Exception exc){
				}
			}
			scanner.close();
			//now showing the users
			for(int id:userset){
				System.out.println(id+",");
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected static void normalizeReputations()
	{
		//normalizing the author reputation
		String authrepu=StaticData.SOPostData+"/authrepu.txt";
		try {
			Scanner scanner=new Scanner(new File(authrepu));
			int maxrepu=0;
			HashMap<Integer, Double> repumap=new HashMap<>();
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				int authid=Integer.parseInt(line.split("\\s+")[0].trim());
				int repu=Integer.parseInt(line.split("\\s+")[1].trim());
				repumap.put(authid, (double)repu);
				if(repu>maxrepu){
					maxrepu=repu;
				}
			}
			scanner.close();
			for(Integer key:repumap.keySet()){
				double val=repumap.get(key)/maxrepu;
				repumap.put(key, val);
				System.out.println(key+"\t"+val);
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		normalizeReputations();
	}
}
