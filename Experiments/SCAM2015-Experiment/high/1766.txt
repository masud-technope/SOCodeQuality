public class Combination {

    public static void main(String[] args) {
        char[] digits = Integer.toString(123).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            System.out.println("" + digits[i] + digits[(i + 1) % digits.length] + digits[(i + 2) % digits.length]);
        }
    }
}