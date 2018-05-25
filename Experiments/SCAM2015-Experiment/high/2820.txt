public static <T> void multiListToArray(final List<List<T>> listOfList, 
                                        final T[][] arr) {
    for (int i = 0; i < listOfList.size(); ++i) {
        arr[i] = listOfList.get(i).toArray(arr[i]);
    }
}