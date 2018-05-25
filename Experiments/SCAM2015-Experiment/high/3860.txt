public class Test {

    public static void main(String[] args) {
        int[] original = { 10, 2, 24, 32 };
        System.out.println(canDivideArray(original));
    }

    private static boolean canDivideArray(int[] originalArray) {
        int total = 0;

        for (int number : originalArray) {
            total += number;
        }

        // check if sum == 2x for any value of x
        if (total % 2 != 0) {
            return false;
        } else {
            // sum of each half array should be x
            total /= 2;
        }
        return isTotal(originalArray, originalArray.length, total);
    }

    private static boolean isTotal(int array[], int n, int total) {
        // successful termination condition
        if (total == 0) {
            return true;
        }

        // unsuccessful termination when elements have finished but total is not reached
        if (n == 0 && total != 0){
            return false;
        }

        // When last element is greater than total
        if (array[n - 1] > total)
            return isTotal(array, n - 1, total);

        //check if total can be obtained excluding the last element or including the last element 
        return isTotal(array, n - 1, total - array[n - 1]) || isTotal(array, n - 1, total); 
    }

}