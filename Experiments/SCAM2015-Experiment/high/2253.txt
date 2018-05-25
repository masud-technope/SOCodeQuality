for(Map.Entry<Key, Value> entry1: map.entrySet()) {
   Key key1 = entry1.getKey();
   int hash1 = System.identityHashCode(key1);
   Value value1 = entry1.getValue();
   for(Map.Entry<Key, Value> entry2: map.entrySet()) {
       Key key2 = entry2.getKey();
       if (key1 > System.identityHashCode(key2)) continue;

       Value value2 = entry1.getValue();
       // compare value1 and value2;
   }
}