package qstans;

import java.io.File;
import java.util.Scanner;

import ranks.MyPostRankManager;
import extractor.StaticData;

public class VoteRanker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       VoteCollector.get_code_fragment_list();
       String qa5_2 = StaticData.Data_Directory + "/qa5_2.txt";
		try {
			File f = new File(qa5_2);
			Scanner scanner = new Scanner(f);
			MyPostRankManager manager = new MyPostRankManager();
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				manager.rank_the_answer_posts(line);
			}
		} catch (Exception exc) {

		}
		
	}

}
