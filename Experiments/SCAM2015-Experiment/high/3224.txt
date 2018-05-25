static <T> T newInstance(Class<T> tClass, String s) throws Exception{
    return tClass.getConstructor(String.class).newInstance(s);
}

public static void main(String[] args) throws Exception{
    Double d = newInstance(Double.class, "4");
    System.out.println(d);
}