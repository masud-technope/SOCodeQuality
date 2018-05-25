public int compareTo(MyEntry<K, V> object) {
    if ((Long) this.value < (Long) object.value)
        return -1;
    if (this.value.equals(object.value))
        return 0;

    return 1;
}