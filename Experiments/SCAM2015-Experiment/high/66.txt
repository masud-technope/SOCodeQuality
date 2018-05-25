ClassLoader currentThreadClassLoader
 = Thread.currentThread().getContextClassLoader();

// Add the conf dir to the classpath
// Chain the current thread classloader
URLClassLoader urlClassLoader
 = new URLClassLoader(new URL[]{new File("mtFile").toURL()},
                      currentThreadClassLoader);

// Replace the thread classloader - assumes
// you have permissions to do so
Thread.currentThread().setContextClassLoader(urlClassLoader);