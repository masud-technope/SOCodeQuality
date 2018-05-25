class MySecurityManager extends SecurityManager {
  private Object secret;
  public MySecurityManager(Object pass) { secret = pass; }
  private void disable(Object pass) {
    if (pass == secret) secret = null;
  }
  // ... override checkXXX method(s) here.
  // Always allow them to succeed when secret==null
}