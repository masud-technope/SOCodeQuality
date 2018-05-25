interface Function<T> {
    public T eval(T argument);
}

class Lazy<T> {
    private Iterator<T> source;
    private Function<T> filter;
    Lazy(final Iterator<t> source, final Function<T> filter) {
        this.source = source;
        this.filter = filter;
    }
    public T step() {
        return filter.eval(source.next());
    }
}