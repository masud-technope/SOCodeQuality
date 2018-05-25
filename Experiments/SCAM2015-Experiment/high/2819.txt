public static <T> T[][] multiListToArray(final List<List<T>> listOfList, 
                                         final Class<T> classz) {
    final T[][] array = (T[][]) Array.newInstance(classz, listOfList.size(), 0);

    for (int i = 0; i < listOfList.size(); i++) {
        array[i] = listOfList.get(i).toArray((T[]) Array.newInstance(classz, listOfList.get(i).size()));
    }

    return array;
}