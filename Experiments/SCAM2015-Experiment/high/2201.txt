public int addPatron(String name) throws PatronException {
    int maxKey = -1;

    for (Map.Entry<Integer, Patron> entry : patrons.entrySet()) {
        if (entry.getValue().getName().equals(name)) {
            // TODO: Consider using IllegalArgumentException
            throw new PatronException("This patron already exists");
        }
        maxKey = Math.max(maxKey, entry.getKey());
    }
    int newKey = maxKey + 1;
    Patron newPatron = new Patron(name, newKey);
    patrons.put(newKey, newPatron);
    return newKey;
}