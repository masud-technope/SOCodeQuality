public class FinalWrapperFactory {
  private FinalWrapper wrapper;

  public Singleton get() {
    FinalWrapper w = wrapper;
    if (w == null) { // check 1
      synchronized(this) {
        w = wrapper;
        if (w == null) { // check2
          w = new FinalWrapper(new Singleton());
          wrapper = w;
        }
      }
    }
    return w.instance;
  }

  private static class FinalWrapper {
    public final Singleton instance;
    public FinalWrapper(Singleton instance) {
      this.instance = instance;
    }
  }
}