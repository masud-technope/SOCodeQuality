public class MyRunnable implements Runnable {
  final CountDownLatch latch = new CountDownLatch(1);

  public void run() {
    try { latch.await(); } catch (InterruptedException e) {}
    System.out.println("second");
  }

  public static void main(String args[]) {
    final MyRunnable r = new MyRunnable();
    new Thread(r).start();
    System.out.println("first\n");
    r.latch.countDown();
  }
}