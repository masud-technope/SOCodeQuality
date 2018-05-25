public <T> boolean checkType(Vector<T> vec) {
    return T instanceof Integer; // impossible
    return T == Integer; // impossible
    return T.class == Integer.class // impossible
    return vec instanceof (Vector<Integer>); // impossible
}