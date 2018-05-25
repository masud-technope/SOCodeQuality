public class Test {

    public Test(String single) {
        System.out.println("Single");
    }

    public Test(String... multiple) {
        System.out.println("Multiple");
    }

    public static void main(String[] args) {
        new Test("Foo"); // Single
        new Test("Foo", "Bar"); // Multiple
        new Test(); // Effectively multiple
        // new Test(null); // Doesn't compile - ambiguous
        new Test((String) null); // Single
    }
}