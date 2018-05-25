public class Demo {
    public static void main(String args[]) {
        int[] numbers = new int[] {2, 3, 4};

        System.out.println(maxValue(numbers));
    }

    public static int maxValue(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }
}