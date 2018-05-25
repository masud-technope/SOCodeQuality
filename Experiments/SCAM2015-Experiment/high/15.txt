public class Test<E> {
    private final Class<E> clazz;
    public Test(Class<E> clazz) {
        if (clazz == null) {
            throw new NullPointerException();
        }
        this.clazz = clazz;
    }
    // To make things easier on clients:
    public static <T> Test<T> create(Class<T> clazz) {
        return new Test<T>(clazz);
    }
    public boolean sameClassAs(Object o) {
        return o != null && o.getClass() == clazz;
    }
}