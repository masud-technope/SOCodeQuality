public static <T> T[] convertToArray(List<?> list, Class<T> c) {
    @SuppressWarnings("unchecked")
    T[] result = (T[]) Array.newInstance(c, list.size());
    result = list.toArray(result);
    return (T[]) result;
}