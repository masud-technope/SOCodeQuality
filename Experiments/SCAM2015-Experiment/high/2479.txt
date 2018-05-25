private Date someMethod(Boolean test) {
  Date result;
  if (null == test) {
    result = null
  } else {
    result = test ? something : other;
  }
  return result;
}