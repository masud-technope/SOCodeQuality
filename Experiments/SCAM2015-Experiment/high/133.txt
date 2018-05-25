class MyIsolatedThread extends Thread {
  private Object pass = new Object();
  private MyClassLoader loader = new MyClassLoader();
  private MySecurityManager sm = new MySecurityManager(pass);
  public void run() {
    SecurityManager old = System.getSecurityManager();
    System.setSecurityManager(sm);
    runUntrustedCode();
    sm.disable(pass);
    System.setSecurityManager(old);
  }
  private void runUntrustedCode() {
    try {
      // run the custom class's main method for example:
      loader.loadClass("customclassname")
        .getMethod("main", String[].class)
        .invoke(null, new Object[]{...});
    } catch (Throwable t) {}
  }
}