//gets the keys from the hashmap
Set<Integer> keys = one.keySet();
//merge the keys from the second hashmap
keys.addAll(two.keySet());
//new hashmap
Map<Integer, Class3> newMap = new HashMap<Integer, Class3>();
for (Integer key : keys){
     //create new instance and place it in the map
     newMap.put(key, new Class3(one.get(key), two.get(key));
}