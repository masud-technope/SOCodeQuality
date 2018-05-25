public static LinkedHashMap<String, Integer> getTopHalf(LinkedHashMap<String, Integer> map){
    LinkedHashMap<String, Integer> sorted = sortHashMapByValues(map);
    LinkedHashMap<String, Integer> out = new LinkedHashMap<String, Integer>();
    Iterator<Entry<String,Integer>> it = sorted.entrySet().iterator();
    for(int i = 0;  i<map.size()/2; i++){
        Entry<String, Integer> e = it.next();
        out.put(e.getKey(), e.getValue());
    }
    return out;
}