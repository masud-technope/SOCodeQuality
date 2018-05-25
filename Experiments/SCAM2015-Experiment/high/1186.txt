public class NewTest {

    public static void main(final String[] args) {
        TheClass();
        new TheClass();
    }

    static void TheClass() {
        System.out.println("Method");
    }

    static class TheClass {
        TheClass() {
            System.out.println("Constructor");
        }
    }
}