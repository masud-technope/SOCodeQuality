import java.util.*;
    //...

    List<int[]> rowList = new ArrayList<int[]>();

    rowList.add(new int[] { 1, 2, 3 });
    rowList.add(new int[] { 4, 5, 6 });
    rowList.add(new int[] { 7, 8 });

    for (int[] row : rowList) {
        System.out.println("Row = " + Arrays.toString(row));
    } // prints:
      // Row = [1, 2, 3]
      // Row = [4, 5, 6]
      // Row = [7, 8]

    System.out.println(rowList.get(1)[1]); // prints "5"