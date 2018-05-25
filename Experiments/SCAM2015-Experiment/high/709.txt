public class ParallelIterator <T1, T2> implements Iterator<Pair<T1, T2>> {

    public class Pair<TT1, TT2> {
        private final TT1 v1;
        private final TT2 v2;
        private Pair(TT1 v1, TT2 v2) { this.v1 = v1; this.v2 = v2; }
        ...
    }

    private final Iterator<T1> it1;
    private final Iterator<T2> it2;

    public ParallelIterator(Iterator<T1> it1, Iterator<T2> it2) { 
        this.it1 = it1; this.it2 = it2;
    }

    public boolean hasNext() { return it1.hasNext() && it2.hasNext(); }

    public Pair<T1, T2> next() {
        return new Pair<T1, T2>(it1.next(), it2.next());
    }

    ...

}