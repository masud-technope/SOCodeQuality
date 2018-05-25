public class Singleton {
  private static Singleton instance;
  public static synchronized getInstance() {
    if (instance == null)
      instance = new Singleton();
  }
}