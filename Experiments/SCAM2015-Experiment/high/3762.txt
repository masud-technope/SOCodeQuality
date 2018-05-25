class AISetWrapper {
    Set<A> set = new HashSet<>();

    <T extends A & I> Set<T> getSet() {
        return (Set<T>) set; // unchecked cast that only works because generics are not reified
    }
}