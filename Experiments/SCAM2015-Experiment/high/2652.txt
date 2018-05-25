public static void main(String[] args) {

    int[] value   = {5,16,3,32};
    // Guarantee sane initial min/max
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;


    for (final int val: value) {
        if (val < min)
            min = val;
        if (val > max)
            max = val;
    }

    System.out.println("diff is " + (max - min));
}