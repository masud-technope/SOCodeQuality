private Date someMethod(Boolean test) {

  if (null == test) { 
    return null 
  }
  return test ? something : other;
}