HashMap<HashSet<Integer>, String> map = new HashMap<HashSet<Integer>, String>();
HashSet<Integer> a = new HashSet<Integer>();
a.add(1);
a.add(2);
a.add(5);

HashSet<Integer> b = new HashSet<Integer>();
b.add(5);
b.add(1);
b.add(2);

map.put(a, "w00t");

System.out.println(map.get(b));