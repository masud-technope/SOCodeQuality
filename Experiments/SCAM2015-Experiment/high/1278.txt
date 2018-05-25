public static boolean isWrapperClass(Class<?> clazz) {
    try {
        clazz.getDeclaredField("TYPE");
        return true;
    catch (NoSuchFieldException ex) {
        return false;
    }
}