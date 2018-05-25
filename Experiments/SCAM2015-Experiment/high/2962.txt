public class ArrayExample {
    public static void main(String[] args) {
        int[][] array=
        {
            {1},
            {1, 2, 3},
            {1, 2, 3, 4, 5},
            {1, 2}
        };
        int x, y;
        int[] second;

        for (x = 0; x < array.length; ++x) {
          second = array[x];
          for (y = 0; y < second.length; ++y) {
              System.out.println(x + "," + y + ": " + second[y]);
          }
          System.out.println();
        }
    }
}