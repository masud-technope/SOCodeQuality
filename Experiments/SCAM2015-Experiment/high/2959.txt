boolean replace(K key, int hash, V oldValue, V newValue) { 
               // called by replace(K key, V oldValue, V newValue)
        lock(); // acquire the lock
        try {
            HashEntry<K,V> e = getFirst(hash);
            while (e != null && (e.hash != hash || !key.equals(e.key)))
                e = e.next;

            boolean replaced = false;
            if (e != null && oldValue.equals(e.value)) {
                replaced = true;
                e.value = newValue;
            }
            return replaced;
        } finally {
            unlock(); // unlock 
        }
    }