import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class EnumProgram {

    public static void main(String... args) {
        test("a NULL b", "a  b");
        test("a null b", "a  b");
        test("a Null b", "a  b");
        test("a NuLl b", "a  b");
        test("a (null) b", "a  b");
        test("a [null] b", "a  b");
        test("a {null} b", "a  b");
    }

    private static void test(String value, String expected) {
        String newValue = Util.removeNullString(value);
        System.out.println(value + " : " + newValue.equals(expected));
    }
}

class Util {
    private static Pattern pattern = Pattern.compile("(?i)[(\\[{]?null[)\\]}]?");

    public static String removeNullString(String value) {
        if (StringUtils.isEmpty(value)) {
            return StringUtils.EMPTY;
        }

        Matcher matcher = pattern.matcher(value);
        return matcher.replaceAll(StringUtils.EMPTY);
    }
}