interface Foo {
    public void doFoo(int i, int j);
}

class Bar implements Foo {
    @Override
    public void doFoo(int i, int j) {
        System.out.println(i + j);
    }
}

class Baz implements Foo {
    @Override
    public void doFoo(int i, int j) {
        System.out.println(i - j);
    }
}