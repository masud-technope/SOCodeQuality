private static void bubblesort(Integer[] array) {
    for (int i = 0; i < array.length; i++) {
        for(int j = 0; j < array.length - 1; j++) {
            if(array[j].compareTo(array[j+1]) > 0) {
                swap(j, j+1, array);
            }
        }
    }

}

private static void swap(Integer index1, Integer index2, Integer[] array) {
    if(index1 == index2)return;
    Integer temp = new Integer(array[index2]);
    array[index2] = array[index1];
    array[index1] = temp;

}