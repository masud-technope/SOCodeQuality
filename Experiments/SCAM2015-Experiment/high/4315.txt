public interface Container<K> { // K is the type of the key...

    public <V> V get(K key) ;
    public <V> void put(K key, V value);

}