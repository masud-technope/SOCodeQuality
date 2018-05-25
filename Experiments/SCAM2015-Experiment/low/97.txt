private static Method[] declaredMethods(Class<T> clazz, String methodName) {
  Method[] result = new Method[1];
  try{
    result[0] = clazz.getDeclaredMethod(methodName);
  } catch (NoSuchMethodException nsme) {
    // respond to the error
  } catch (SecurityException se)  {
    // Respond to the error
  }

  return result;
}

Method[] actions = declaredMethods("count");