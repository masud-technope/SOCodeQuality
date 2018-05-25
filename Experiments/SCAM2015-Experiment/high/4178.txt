// abbreviated example
class FooMap {
    private static Map<Class<? extends IFoo>, Map<String, IFoo>> map = ...;

    static void put(String key, IFoo foo) {
        map.get(foo.getClass()).put(key, foo);
    }

    static <F extends IFoo> F get(Class<F> cls, String key) {
        return cls.cast(map.get(cls).get(key));
    }
}

FooMap.put("foo", new Foo());
Foo foo = FooMap.get(Foo.class, "foo");