public <V> SortedMap<String, V> filterPrefix(SortedMap<String,V> baseMap, String prefix) {
    if(prefix.length() > 0) {
        char nextLetter = prefix.charAt(prefix.length() -1) + 1;
        String end = prefix.substring(0, prefix.length()-1) + nextLetter;
        return baseMap.subMap(prefix, end);
    }
    return baseMap;
}