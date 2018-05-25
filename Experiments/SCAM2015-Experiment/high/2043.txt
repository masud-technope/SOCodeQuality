public class MyRunnable implements Runnable {
  volatile boolean condition = false;

  public void run() {
    while (true) {
      if (condition) {
        System.out.println("second");
        break;
      }
    }
  }
  public static void main(String args[]) {
    final MyRunnable r = new MyRunnable();
    new Thread(r).start();
    System.out.println("first\n");
    r.condition = true;
  }
}