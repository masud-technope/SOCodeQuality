public static <T> boolean oneValue(java.util.List<T> in) {
  if (in == null)
    return false;
  T o = in.get(0);
  for (int i = 1; i < in.size(); i++)
    if (!in.get(i).equals(o))
      return false;
  return true;
}