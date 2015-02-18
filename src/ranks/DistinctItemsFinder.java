package ranks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import org.apache.commons.collections.CollectionUtils;
import extractor.StaticData;

public class DistinctItemsFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String components=StaticData.Data_Directory+"/components.txt";
		HashSet<String> solvedList=new HashSet<>();
		
		HashSet<String> readSet=new HashSet<>();
		HashSet<String> authSet=new HashSet<>();
		HashSet<String>	soundSet=new HashSet<>();
		HashSet<String> sonarSet=new HashSet<>();
		
		File f=new File(components);
		Scanner scanner;
		try {
			scanner = new Scanner(f);
			int count=0;
			while(scanner.hasNext()){
			String line=scanner.nextLine();
			String[] qids=line.split("\\s+");
			for(String qid:qids){
				solvedList.add(qid.trim());
				switch(count)
				{
				case 0:
					readSet.add(qid);
					break;
				case 1:
					authSet.add(qid);
					break;
				case 2:
					soundSet.add(qid);
					break;
				case 3:
					sonarSet.add(qid);
					break;
				}
			}
			count++;
			}
			System.out.println("Distinct items solved:"+solvedList.size());
			System.out.println("Read vs Auth:"+(CollectionUtils.intersection(readSet, authSet).size()));
			System.out.println("Read vs sound:"+(CollectionUtils.intersection(readSet, soundSet).size()));
			System.out.println("Read vs sonar:"+(CollectionUtils.intersection(readSet, sonarSet).size()));
			System.out.println("Auth vs Sound:"+(CollectionUtils.intersection(authSet, soundSet).size()));
			System.out.println("Auth vs Sonar:"+(CollectionUtils.intersection(authSet, sonarSet).size()));
			System.out.println("Sonar vs Sound:"+(CollectionUtils.intersection(soundSet, sonarSet).size()));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
