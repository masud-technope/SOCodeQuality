private <T> boolean arePropertiesEqual(T t1, T t2, Function<T, ?>... functions) {
    if (t1 == null || t2 == null) {
        return t1 == t2; // Shortcut
    }
    for (Function<T, ?> function : functions) {
        if (!Objects.equals(function.apply(t1), function.apply(t2))) {
            return false;
        }
    }
    return true;
}

private void someMethod(Person p1, Person p2) {
    boolean b = arePropertiesEqual(p1, p2,
            Person::getFirstName, Person::getLastName);
}