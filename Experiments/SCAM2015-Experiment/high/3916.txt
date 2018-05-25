List<String[]> input = ...;
    Set<String> allCombinations = new HashSet<>();
    for (int i = 0; i < input.size() - 1; i++) {
        for (int j = i + 1; j < input.size(); j++) {
            allCombinations.addAll(twoArraysCombinations(input.get(i), input.get(j)));
        }
    }
    // print allCombinations


private static Set<String> twoArraysCombinations(String[] first, String[] second) {
    Set<String> result = new HashSet<>();
    for (String f : first) {
        for (String s : second) {
            result.add(f + s);
        }
    }
    return result;
}