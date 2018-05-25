private Object actuallyT;

public <T> List<T> magicalListGetter(Class<T> klazz) {
    List<T> list = new ArrayList<>();
    list.add(klazz.cast(actuallyT));
    try {
        list.add(klazz.getConstructor().newInstance()); // If default constructor
    } ...
    return list;
}