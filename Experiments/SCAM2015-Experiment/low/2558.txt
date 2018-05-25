public class StringMatcher {

    public static void main(String[] args) {
        String[] words = new String[]{"abcd", "abcde", "abcdef", "abfg", "abdc"};
        String filter = "abc";

        for (String word : words) {
            if (word.matches(filter + "(.*)")) {
                System.out.println("This pass the filter: " + word);
            }
        }
    }
}