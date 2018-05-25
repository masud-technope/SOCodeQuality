public class Singleton {
  private static volatile Singleton instance;
  public static Singleton getInstance() {
    if (instance == null) {
      synchronized {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}