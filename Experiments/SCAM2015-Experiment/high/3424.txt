public static boolean isSorted(double[] list) {

    for (int i = 1; i < list.length; i++) {
        if (list[i - 1] > list[i]) {
            System.out.println("Not Sorted");
            return false;
        }
    }
    return true;
}