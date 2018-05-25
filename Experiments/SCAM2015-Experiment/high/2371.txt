static <T extends Foo> List<T> getFooList(int size) {
    List<T> fooList = new ArrayList<T>(size);
    for (int i = 0; i < size; i++) {
        T foo = getFoo();
        fooList.add(foo);
    }
    return fooList;
}

public static void main(String[] args) {

    List<Foo1> foo1List = getFooList(5);

    // a bunch of things happen

    //sometime later maybe, depending on state
    foo1List.get(0).foo1Method(); //ClassCastException is thrown here
}