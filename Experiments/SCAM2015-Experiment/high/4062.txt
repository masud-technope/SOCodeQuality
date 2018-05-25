public static Set<Character> stringToCharacterSet(String s) {
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
        set.add(c);
    }
    return set;
}

public static boolean containsAllChars
    (String container, String containee) {
    return stringToCharacterSet(container).containsAll
               (stringToCharacterSet(containee));
}

public static void main(String[] args) {
    String one = "This is a test";
    String two = "This is a simple test";
    System.out.println (containsAllChars(one, two));
}