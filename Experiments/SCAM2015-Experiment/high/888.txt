void merge(int[] A, int[] B, int[][] C) {
    int[] t = internalMerge(A, B);
    C[0] = t;
}
int[][] icky = new int[1][0];
merge(..., ..., icky);
int[] r = icky[1];