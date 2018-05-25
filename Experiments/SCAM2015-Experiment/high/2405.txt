class Example {
    public static <T> List<T> m1() {
        return m2(Arrays.<T> asList()); //Arrays.asList() would not compile
    }
    public static <T> List<T> m2(List<T> l) {
        return l;
    }
}