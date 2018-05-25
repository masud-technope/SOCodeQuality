public class MyRunnable<T> implements Runnable {
  private final T t;

  public MyRunnable(T t) {
    this.t = t;
  }

  public void run() {
    // Reference t.
  }
}