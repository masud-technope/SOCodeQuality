class Test1<T> {
    Test1(T type) { Class<?> classType = type.getClass();}
}

class Test2 extends Test1<String> {
    Test2() {
        super("");
    }
}