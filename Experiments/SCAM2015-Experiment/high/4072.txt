// TODO: Much better exception handling :) (It's almost never appropriate to
// throw Exception...)
public static String getS(Class<?> clazz) throws Exception {
    Field field = clazz.getField("s");
    return (String) field.get(null);
}