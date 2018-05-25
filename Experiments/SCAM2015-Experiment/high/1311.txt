public static boolean[][] setFalse(boolean[][] matrix) {
    // Changes each value of the matrix to a false boolean value

    for (int r = 0; r < matrix.length; r++ ) {
        for (int c = 0; c < matrix[r].length; c++ ) {
            matrix[r][c] = false;
        }
    }
    return matrix;
}