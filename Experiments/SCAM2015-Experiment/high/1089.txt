public static int hash(int h) {
    // This function ensures that hashCodes that differ only by
    // constant multiples at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}

public static void main(String[] args) throws Exception {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>(32, 2.0f);
    for (int i = 0; i < 10000 && map.size() < 32 * 2; i++) {
        if (hash(i) % 32 == 0)
            map.put(i, i);
    }
    System.out.println(map.keySet());
}