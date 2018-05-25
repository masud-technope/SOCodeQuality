public class ArrayExample {
    public static void main(String[] args) {
        int[][] array=
        {
            {1},
            {1, 2, 3},
            {1, 2, 3, 4, 5},
            {1, 2}
        };

        for (int[] second : array) {
          for (int entry : second) {
              System.out.println(entry);
          }
          System.out.println();
        }
    }
}