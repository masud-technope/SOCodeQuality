void service() {
    List<Base> theList = new ArrayList<Base>();

    produceObjects(theList);
    consumeObjects(theList);
}

void produceObjects(List<? super Base> consumerList) {
    consumerList.add(new Derived());
}

void consumeObjects(List<? extends Base> producerList) {
    for (Base base : producerList) {
        base.foo();
    }
}