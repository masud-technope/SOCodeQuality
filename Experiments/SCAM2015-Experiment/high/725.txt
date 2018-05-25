Class[] classes;
if (newValue instanceof Integer) {
  classes = new Class[] { int.class };
} else if (newValue instanceof Double) {
  /* etc...*/
} else {
  classes = new Class[] {newValue.getClass() };
}