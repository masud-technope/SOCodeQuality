List<List<String>> permutations = allPermutationsOf("fur = 'fluffy'", 
    "colour = 'white'", "scars = 'numerous'", "disposition = 'malignant'");
List<String> allSqlVariations = new ArrayList<>(permutations.size());
for (List<String> permutation : permutations) {
    allSqlVariations.add("SELECT ... WHERE " + join(permutation, " OR "));
}
assertThat(generatedSql, is(anyOf(allSqlVariations)));