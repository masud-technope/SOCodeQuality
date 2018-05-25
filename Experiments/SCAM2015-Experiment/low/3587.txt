import java.util.Random;

public class Demo {

    private static int someValue;

    public static void main(String args[]) {

        setValue(calculate(
        createRandomNumber(), 
        createRandomNumber(), 
        createRandomNumber()));

        System.out.println(someValue);
    }

    public static void setValue(int value) {
        someValue = value;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static int createRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}