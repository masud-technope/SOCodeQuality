public interface Creator<T> {
        T create();
}
public interface StringCreator extends Creator<String> { }
public class StringCreatorImpl implements StringCreator  {
        public String create() { return new String(); }
}
public class FancyStringCreator implements StringCreator  {
        public String create() { return new StringBuffer().toString(); }
}
public static void main(String[] args) throws Exception {
        Class<?> someClass = Class.forName(args[0]);
        Class<? extends StringCreator> creatorClass = someClass.asSubclass(StringCreator.class);
        Constructor<? extends StringCreator> creatorCtor = creatorClass.getConstructor((Class<?>[]) null);
        Creator<String> creator = creatorCtor.newInstance((Object[]) null);
}