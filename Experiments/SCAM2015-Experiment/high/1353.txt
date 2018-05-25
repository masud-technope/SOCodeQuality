Map<String, String> replacements = new HashMap<String, String>() {{
    put("substr1", "repl1");
    put("substr2", "repl2");
    put("substr3", "repl3");
}};

String input = "lorem substr1 ipsum substr2 dolor substr3 amet";

// create the pattern joining the keys with '|'
String regexp = "substr1|substr2|substr3";

StringBuffer sb = new StringBuffer();
Pattern p = Pattern.compile(regexp);
Matcher m = p.matcher(input);

while (m.find())
    m.appendReplacement(sb, replacements.get(m.group()));
m.appendTail(sb);


System.out.println(sb.toString());   // lorem repl1 ipsum repl2 dolor repl3 amet