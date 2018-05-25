LinkedHashSet<T> set = ...

LinkedList<T> list = new LinkedList<>(set);
Iterator<T> itr = list.descendingIterator();
while(itr.hasNext()) {
    T item = itr.next();
    // do something
}