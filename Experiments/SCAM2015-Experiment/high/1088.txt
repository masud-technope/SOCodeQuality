public static void main(String[] args) throws Exception {
    for (int len : new int[]{100 * 1000 * 1000, 10 * 1000 * 1000, 1000 * 1000, 100 * 1000, 10 * 1000, 1000}) {
        int[] nums = new int[len];
        for (int i = 0; i < len; i++)
            nums[i] = (int) (Math.random() * (Math.random() * 2001 - 1000));
        Arrays.sort(nums);

        long timeArray = 0;
        long timeSet = 0;
        int runs = len > 1000 * 1000 ? 10 : len >= 100 * 1000 ? 100 : 1000;
        for (int i = 0; i < runs; i++) {
            long time1 = System.nanoTime();
            int count = countDistinct(nums);
            long time2 = System.nanoTime();
            int count2 = countDistinctUsingSet(nums);
            long time3 = System.nanoTime();
            timeArray += time2 - time1;
            timeSet += time3 - time2;
            assert count == count2;
        }
        System.out.printf("For %,d numbers, using an array took %,d us on average, using a Set took %,d us on average, ratio=%.1f%n",
                len, timeArray / 1000 / runs, timeSet / 1000 / runs, 1.0 * timeSet / timeArray);
    }
}

private static int countDistinct(int[] nums) {
    int lastLeft = Math.abs(nums[0]);
    int lastRight = Math.abs(nums[nums.length - 1]);
    int count = 0;
    for (int a = 1, b = nums.length - 2; a <= b;) {
        int left = Math.abs(nums[a]);
        int right = Math.abs(nums[b]);
        if (left == lastLeft) {
            a++;
            lastLeft = left;
        } else if (right == lastRight) {
            b--;
            lastRight = right;
        } else if (lastLeft == lastRight) {
            a++;
            b--;
            lastLeft = left;
            lastRight = right;
            count++;
        } else if (lastLeft > lastRight) {
            count++;
            a++;
            lastLeft = left;
        } else {
            count++;
            b--;
            lastRight = right;
        }
    }
    count += (lastLeft == lastRight ? 1 : 2);
    return count;
}

private static int countDistinctUsingSet(int[] nums) {
    Set<Integer> s = new HashSet<Integer>();
    for (int n : nums)
        s.add(Math.abs(n));
    int count = s.size();
    return count;
}