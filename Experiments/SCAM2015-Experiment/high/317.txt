public class Cache<T> {
  private final ScheduledExecutorsService executor =
    Executors.newSingleThreadExecutorService();
  private final Callable<T> method;
  private final Runnable refresh;
  private Future<T> result;
  private final long ttl;

  public Cache(Callable<T> method, long ttl) {
    if (method == null) {
      throw new NullPointerException("method cannot be null");
    }
    if (ttl <= 0) {
      throw new IllegalArgumentException("ttl must be positive");
    }
    this.method = method;
    this.ttl = ttl;

    // initial hits may result in a delay until we've loaded
    // the result once, after which there will never be another
    // delay because we will only refresh with complete results
    result = executor.submit(method);

    // schedule the refresh process
    refresh = new Runnable() {
      public void run() {
        Future<T> future = executor.submit(method);
        future.get();
        result = future;
        executor.schedule(refresh, ttl, TimeUnit.MILLISECONDS);
      }
    }
    executor.schedule(refresh, ttl, TimeUnit.MILLISECONDS);
  }

  public T getResult() {
    return result.get();
  }
}