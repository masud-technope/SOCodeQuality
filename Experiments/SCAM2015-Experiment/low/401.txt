class Main {
    private static class CustomThread extends Thread {
        public int x = 0;
        public void run() {
            x = 5;
        }
    }

    public static void main(String[] args) {

        CustomThread t = new CustomThread();
        t.start();

        System.out.println(t.x);
        System.out.println(t.x);
    }
}