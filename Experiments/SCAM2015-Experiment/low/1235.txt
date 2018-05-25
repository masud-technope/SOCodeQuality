public class ArrayFilter {

    private static int[][] arr = new int[][] { {1, 2, 3}, {1, 2, 3}, {4, 5, 6}};

    private static void printOddEvens(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                // rowIndex + value is only even when both are odd or both are even
                // the modulo (%) operator returns the remainder of the division
                if ((row + matrix[row][col]) % 2 == 0) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printOddEvens(arr);
    }
}