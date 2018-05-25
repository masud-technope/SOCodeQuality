public static <T extends Comparable<T>> int compareObject(T o1, T o2) {
    if (((Object) o1 instanceof String) && ((Object) o2 instanceof String))
        return ((String) (Object)o1).toUpperCase().compareTo(((String) (Object)o2).toUpperCase());
    else
        return o1.compareTo(o2);
}