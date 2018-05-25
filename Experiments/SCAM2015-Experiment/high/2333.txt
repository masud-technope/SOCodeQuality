import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastMatch {
    private static int indexOfLastMatch(Pattern pattern, String input) {
        Matcher matcher = pattern.matcher(input);
        for (int i = input.length(); i > 0; --i) {
            Matcher region = matcher.region(0, i);
            if (region.matches() || region.hitEnd()) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z]+[0-9]+[a-z]+");
        String[] samples = {
                "*ABC",
                "A1b*",
                "AB12uv",
                "AB12uv*",
                "ABCDabc",
                "ABC123X"
        };

        for (String sample : samples) {
            int lastMatch = indexOfLastMatch(pattern, sample);
            System.out.println(sample + ": last match at " + lastMatch);
        }
    }
}