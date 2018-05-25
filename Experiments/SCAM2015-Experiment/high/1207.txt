List<String> removedElements = Lists.newArrayList();
final Iterables.removeIf(list, new Predicate<String>() {
    @Override
    public boolean apply(String input) {
        if ("a".equals(input)) {
            removedElements.add(input);
            return true;
        }
        return false;
    }
});