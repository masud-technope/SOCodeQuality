//class is a reserved word, so use clazz
public <T> T getObject(Class<T> clazz) {
  try {
    return clazz.newInstance();
  }
  catch( /*a multitude of exceptions that can be thrown by clazz.newInstance()*/ ) {
    //handle exception
  }
}