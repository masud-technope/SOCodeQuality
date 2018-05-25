String s = "stackjomvammssastackvmlmvlrstack";
String match = "stack";
int start = s.indexOf(match);
int end = (start + match.length() - 1);
System.out.println(match + " found at index " + start);
System.out.println("Index of last character of first match is " + end);