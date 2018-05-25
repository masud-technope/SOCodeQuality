List<String>[] lsa = new List<String>[10]; // illegal
Object[] oa = lsa;  // OK because List<String> is a subtype of Object
List<Integer> li = new ArrayList<Integer>();
li.add(new Integer(3));
oa[0] = li; 
String s = lsa[0].get(0);