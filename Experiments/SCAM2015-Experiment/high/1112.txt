abstract class AbstractBuilder<T extends AbstractBuilder<T>> {
    protected abstract T getThis();

    public T foo() {
        // set some property
        return getThis();
    }
}


class TheBuilder extends AbstractBuilder<TheBuilder> {
    @Override protected TheBuilder getThis() {
        return this;
    }
    ...
}