String s = "stackjomvammssastackvmlmvlrstack";
String match = "s.*?k";
Matcher m = Pattern.compile(match).matcher(s);
if (m.find()) {
    System.out.println(m.end() - 1);
}