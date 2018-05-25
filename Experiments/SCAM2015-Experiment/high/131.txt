class MyClassLoader extends ClassLoader {
  @Override
  public Class<?> loadClass(String name) throws ClassNotFoundException {
    if (name is white-listed JDK class) return super.loadClass(name);
    return findClass(name);
  }
  @Override
  public Class findClass(String name) {
    byte[] b = loadClassData(name);
    return defineClass(name, b, 0, b.length);
  }
  private byte[] loadClassData(String name) {
    // load the untrusted class data here
  }
}