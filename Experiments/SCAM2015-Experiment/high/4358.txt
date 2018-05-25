import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Iter {

    public static void main(String[] args) {
        List<int[]> list = new LinkedList<int[]>();
        list.add(new int[] { 1, 3, 4 });
        list.add(new int[] { 4, 5 });
        list.add(new int[] { 1, 4, 6 });

        iter(list);
    }

    private static void iter(List<int[]> list) {
        int[] index = new int[list.size()];
        Arrays.fill(index, 0);
        boolean done = false;

        do {
            // Output digits for this row
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)[index[i]]);
            }
            System.out.println();

            // Rollover digits, starting from last
            for (int j = list.size() - 1; j >= 0; j--) {
                index[j] = (index[j] + 1) % list.get(j).length;
                if (index[j] > 0) break;
                if (j == 0) done = true;
            }
        } while (!done);
    }

}