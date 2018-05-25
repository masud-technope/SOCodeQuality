private <T> boolean arePropertiesEqual(T t1, T t2, Function<T, ?>... functions) {
    if (t1 == null || t2 == null) {
        return t1 == t2; // Shortcut
    }
    for (Function<T, ?> function : functions) {
        if (!Objects.equal(function.apply(t1), function.apply(t2))) {
            return false;
        }
    }
    return true;
}

private static class PersonFirstNameFunction 
        implements Function<Person, String> {
    @Override
    public String apply(Person input) {
        return input.getFirstName();
    }
}

private static class PersonLastNameFunction
        implements Function<Person, String> {
    @Override
    public String apply(Person input) {
        return input.getLastName();
    }
}

private void someMethod(Person p1, Person p2) {
    boolean b = arePropertiesEqual(p1, p2, 
            new PersonFirstNameFunction(), new PersonLastNameFunction());
}