public class App {
    public static void main(String[] args) {
        WithoutStaticMethods without = new WithoutStaticMethods();
        without.setValue(1);
        without.calculate();

        WithStaticMethods with = new WithStaticMethods();
        with.setValue(1);
        with.calculate();
    }
}

class WithoutStaticMethods {

    private int value;

    private int helper(int a, int b) {
        return a * b + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int calculate() {
        return helper(value, 2 * value);
    }
}

class WithStaticMethods {

    private int value;

    private static int helper(int a, int b) {
        return a * b + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int calculate() {
        return helper(value, 2 * value);
    }
}