package eric.math;

import java.util.Arrays;

public class Permute {
    // swap 2 elements of an array,
    void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    /**
     * print permutations of array
     * @param arr
     *            original int array,
     */
    void permute(int[] arr) {
        permute(arr, 0, arr.length - 1);
    }

    /**
     * print permutations of array
     * 
     * @param arr
     *            original int array,
     * @param i
     *            start index
     * @param n
     *            end index
     */
    void permute(int[] arr, int i, int n) {
        int j;
        if (i == n)
            System.out.println(Arrays.toString(arr));
        else {
            for (j = i; j <= n; j++) {
                swap(arr, i, j);
                permute(arr, i + 1, n);
                swap(arr, i, j); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        new Permute().permute(arr);
    }
}