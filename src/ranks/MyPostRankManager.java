package ranks;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import extractor.StaticData;

public class MyPostRankManager {

	/**
	 * @param args
	 */

	protected ArrayList<SOPost> sort_the_post_items(ArrayList<SOPost> items) {
		// code for sorting the post items
		Collections.sort(items, new CustomComparator_vpd());
		return items;
	}

	public class CustomComparator_vpd implements Comparator<SOPost> {
		@Override
		public int compare(SOPost o1, SOPost o2) {
			if (o1.votePerDay > o2.votePerDay)
				return -1;
			else if (o1.votePerDay < o2.votePerDay)
				return 1;
			else
				return 0;
		}
	}

	public void rank_the_answer_posts(String line) {
		// code for ranking the answer post
		String rankFolder = "C:/MyWorks/Dataset/SOPost/qstans/ranks";
		String[] parts = line.split("\\s+");
		String qpostID = parts[0];
		// creating question folder
		String qpostFile = rankFolder + "/" + qpostID + ".txt";
		File f = new File(qpostFile);
		// process the rest of items
		ArrayList<SOPost> myitems = new ArrayList<>();
		for (int i = 1; i < parts.length; i++) {
			String[] items = parts[i].split(":");
			int postID = Integer.parseInt(items[0]);
			double votePerDay = Double.parseDouble(items[1]);
			SOPost spost = new SOPost();
			spost.postID = postID;
			spost.votePerDay = votePerDay;
			myitems.add(spost);
		}
		ArrayList<SOPost> sorted = sort_the_post_items(myitems);
		try {
			FileWriter writer = new FileWriter(f);
			int count = 0;
			for (SOPost sp1 : sorted) {
				writer.write(sp1.postID + " " + (++count) + " "
						+ sp1.votePerDay+"\n");
			}
			writer.close();
			System.out.println("Completed:" + qpostID);
		} catch (Exception exc) {

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
