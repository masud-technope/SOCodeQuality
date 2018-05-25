Map<String, String> parametersAndValues = { "fur": "fluffy", "colour", "white" };
String generatedSql = generateSql(parametersToValues);
int whereIndex = generatedSql.indexOf("WHERE");
for (String key, value : parametersAndValues) {
    String fragment = String.format("%s = '%s'", key, value);
    assertThat(generatedSql, containsString(fragment));
    assertThat(whereIndex, is(lessThan(generatedSql.indexOf(fragment))));
}