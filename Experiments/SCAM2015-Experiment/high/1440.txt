import java.util.Arrays;
import java.util.Comparator;

public class MaxIndex {

private static String[] names = { "Checking", "Savings", "DEMAT", "DEMAT Savings",
        "Interest Checking","Savings Interest Checking","My Employee Savings Interest Checking" };

public static void main(String[] args) {

    Arrays.sort(names, new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            Integer L1 = o1.length();
            return L1.compareTo(o2.length())*-1;
        }
    });

    findMaxMatch("Employee Checking");
    findMaxMatch("Employee Savings");
    findMaxMatch("Employee Interest Checking");
    findMaxMatch("Employee Savings Interest Checking");
    findMaxMatch("My Employee Savings Interest Checking");
    findMaxMatch("Employee Current");
}

private static void findMaxMatch(String input) {
    String maxMatch = maxMatch(input);
    if (null != maxMatch) {
        System.out.println("Maximum match for '" + input + "' found at '"
                + maxMatch+"'");
    }else{
        System.out.println("No match for '"+input+"'");
    }
}

private static String maxMatch(String input) {
    for (String name : names) {
        int i = input.indexOf(name);
        if (i > -1) {
            return name;
        }
    }
    return null;
}