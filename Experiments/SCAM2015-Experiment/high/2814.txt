class Test {
    static Test instance = new Test();
    static int x = 1;

    public Test() {
        System.out.printf("x=%d\n", x);
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}