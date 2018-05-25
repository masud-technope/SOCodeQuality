public static boolean arrayEquals(Object arr1, Object arr2) throws Exception {
    Class<?> c = arr1.getClass();
    if (!c.getComponentType().isPrimitive()) {
        c = Object[].class;
    }
    Method m = Arrays.class.getMethod("equals", c, c);
    return (Boolean) m.invoke(null, arr1, arr2);
}