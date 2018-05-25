public class Fibonacci extends ConsoleProgram {
    static int a = 0;
    static int b = 1;

    public void run() {
        for(int i = 0; i <= 25; i++) {
            // Print the call to fibonacci(i) with every iteration.
        }
    }

    private int fibonacci(int n) {
        int c = a + b;
        a = b;
        b = c;
        return c;
    }
}