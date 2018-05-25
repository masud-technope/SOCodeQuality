public void addURL(URL url) throws Exception {
  URLClassLoader classLoader
         = (URLClassLoader) ClassLoader.getSystemClassLoader();
  Class clazz= URLClassLoader.class;

  // Use reflection
  Method method= clazz.getDeclaredMethod("addURL", new Class[] { URL.class });
  method.setAccessible(true);
  method.invoke(classLoader, new Object[] { url });
}

addURL(new File("conf").toURL());

// This should work now!
Thread.currentThread().getContextClassLoader().getResourceAsStream("context.xml");