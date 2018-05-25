public static void main(String... args) {
    String[] strings = new String[] { "foo", "bar" };
    changeReference(strings);
    System.out.println(Arrays.toString(strings)); // still [foo, bar]
    changeValue(strings);
    System.out.println(Arrays.toString(strings)); // [foo, foo]
}
public static void changeReference(String[] strings) {
    strings = new String[] { "foo", "foo" };
}
public static void changeValue(String[] strings) {
    strings[1] = "foo";
}