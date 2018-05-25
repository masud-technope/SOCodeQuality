public static int[] decimalToBinary(int value) {
    int count = 1;
    int tmp = value;
    while (tmp != 0) {
        tmp /= 2;
        count++;
    }
    int[] intArray = new int[count];
    // Do the conversion here...
    return intArray;
}