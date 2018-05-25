public class Test {

    public static void main(String[] args) {
        int[] test = { 1, 3, 2, 6 };
        System.out.println("\nFinal result is "+canBalance(test));
    }

    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("\nIteration of outer for loop when i is " + i);
            int sum = 0;
            for (int j = 0; j < i; j++){
                sum += nums[j];
                System.out.println("Loop 1 -> i(" +i + ") j("+j + ") Add "+nums[j] + ", sum is "+sum+"       ");
            }
            for (int j = i; j < nums.length; j++){
                sum -= nums[j];
                System.out.println("Loop 2 -> i(" +i + ") j("+j + ") Subtract "+nums[j] + ", sum is "+sum+"       ");
            }
            if (sum == 0)
                return true;
        }
        return false;
    }
}