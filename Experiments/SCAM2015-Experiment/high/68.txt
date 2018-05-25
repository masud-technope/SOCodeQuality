public static <T extends Comparable> int compareObject(T o1, T o2) {
    if ((o1 instanceof String) && (o2 instanceof String))
        return ((String) o1).toUpperCase().compareTo(((String) o2).toUpperCase());
    else
        return o1.compareTo(o2);
}