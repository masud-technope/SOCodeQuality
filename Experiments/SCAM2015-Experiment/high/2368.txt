static class FooBarContainer<T extends Foo & Bar> {

    private final T fooBar;

    public FooBarContainer(T fooBar) {
        this.fooBar = fooBar;
    }

    public T get() {
        return fooBar;
    }

    static <T extends Foo & Bar> T unwrap(FooBarContainer<T> fooBarContainer) {
        return fooBarContainer.get();
    }
}