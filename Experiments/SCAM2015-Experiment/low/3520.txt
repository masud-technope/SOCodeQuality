public static Entry<String, Integer> removeLowest(LinkedHashMap<String, Integer> map){
    Entry<String, Integer> lowest = null;
    for(Entry<String,Integer> e: map){
        if(lowest==null || e.getValue().compareTo(lowest.getValue()) < 0){
            lowest = e;
        }
    }
    return lowest;
}