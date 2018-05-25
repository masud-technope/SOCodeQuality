Class<?> enclosingClass = getClass().getEnclosingClass();
if (enclosingClass != null) {
  System.out.println(enclosingClass.getName());
} else {
  System.out.println(getClass().getName());
}