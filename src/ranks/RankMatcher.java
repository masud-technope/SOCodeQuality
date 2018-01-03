package ranks;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;
import extractor.StaticData;

public class RankMatcher {

	/**
	 * @param args
	 */
	
	protected void match_post_ranks(int postID) {
		// code for matching the ranks
		String rank = StaticData.Data_Directory + "/ranks";
		String crank = StaticData.Data_Directory + "/cranks";
		String mrank = StaticData.Data_Directory + "/mranks";
		File f = new File(crank);
		if (f.isDirectory()) {
			File[] files = f.listFiles();

			HashMap<Integer, Integer> mymap = new HashMap<>();
			for (File f2 : files) {
				String qfileName = f2.getName();
				try {
					Scanner scanner = new Scanner(f2);
					while (scanner.hasNext()) {
						String line = scanner.nextLine();
						String[] parts = line.split("\\s+");
						int key = Integer.parseInt(parts[0]);
						int value = Integer.parseInt(parts[1]);
						mymap.put(key, value);
					}
					scanner.close();
				} catch (Exception exc) {
				}

				File ff = new File(rank + "/" + qfileName);
				File outFile = new File(mrank + "/" + qfileName);
				try {
					FileWriter writer = new FileWriter(outFile);
					String vrank = new String();
					String csrank = new String();
					Scanner sc = new Scanner(ff);
					while (sc.hasNext()) {
						String line = sc.nextLine();
						String[] parts = line.split("\\s+");
						int key = Integer.parseInt(parts[0]);
						int _rank = Integer.parseInt(parts[1]);
						vrank += _rank + " ";
						csrank += mymap.get(key) + " ";
					}
					sc.close();
					writer.write(vrank + "\n");
					writer.write(csrank + "\n");
					writer.close();

				} catch (Exception exc) {
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qa_52=StaticData.Data_Directory+"/qa5_2.txt";
		File f=new File(qa_52);
		try
		{
			RankMatcher rmatcher=new RankMatcher();
			Scanner scanner=new Scanner(f);
			while(scanner.hasNext())
			{
				String line=scanner.nextLine();
				int postID=Integer.parseInt(line.split("\\s+")[0]);
				rmatcher.match_post_ranks(postID);
			}
			scanner.close();
		}catch(Exception exc){
		}
	}
}
