List<String> strings = new ArrayList<String>();
@SuppressWarnings("unchecked");
List<Integer> ints = (List) strings;
ints.add(1);

System.out.println(strings); // ok
String s= strings.get(0); // throws a ClassCastException