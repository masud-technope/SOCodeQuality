Map<K, V> map = new HashMap<>();

...

Set<K> keys = map.keySet();
TreeSet<K> smallest = new TreeSet<>(new Comparator<K>(){
    public int compare(K o1, K o2) {
        return o1.getLength() - o2.getLength();
    }
});
smallest.addAll(keys);
for(int x = 0; x < num; x++) {
    keys.remove(smallest.pollFirst());
}