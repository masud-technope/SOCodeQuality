class SizePredicate implements Predicate {
    private List list;
    private int maxSize;

    public SizePredicate(List l, int size) {
        list = l;
        maxSize = size;
    }

    public boolean evaluate(Object obj) {
        if (list.size() >= maxSize) {
            throw new IllegalStateException("Your message here");
        }
        list.add(obj);
    }
}

...

List list = new LinkedList();  // Or, really, any implementation of list.

List maxList = ListUtils.predicatedList(list, new SizePredicate(list, 50));