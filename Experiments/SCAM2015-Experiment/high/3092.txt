static int trueCount(boolean... booleans) {
  int sum = 0;
  for (boolean b : booleans) {
    if (b) {
      sum++;
    }
  }
  return sum;
}