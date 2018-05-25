Map<Character, Integer> countMap = new HashMap<>();
if(!countMap.containsKey('a')) {
    countMap.put('a', 1);
} else {
    countMap.put('a', countMap.get('a') + 1);
}