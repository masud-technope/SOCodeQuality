public abstract class Singleton<T> {
  private T object;

  public synchronized T get() {
    if (object == null) {
      object = create();
    }
    return object;
  }

  protected abstract T create();
}