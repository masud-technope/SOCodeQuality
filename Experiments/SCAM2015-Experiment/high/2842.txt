String literal = "String foo = \"bar\" + \"with\\\"escape\" + \"baz\";";
String regex = "\"(?:\\\\\"|[^\"])*?\"";
String replacement = "\"\"";
String wanted = literal.replaceAll(regex, replacement);
System.out.println(literal);
System.out.println(wanted);