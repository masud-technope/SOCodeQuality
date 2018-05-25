SortedMap<String, String> nameNum = new TreeMap<String, String>();
// put your phone numbers

String prefix = ...;
for(Map.Entry<String,String> entry : filterPrefix(nameNum, prefix).entrySet()) {
    System.out.println(entry);
}