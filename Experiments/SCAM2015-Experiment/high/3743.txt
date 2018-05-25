private static int indexOfMin(int[] a, int cnt) {
  int loc = 0;
  int min = a[loc];
  for (int i = 1; i < cnt; i++) {
    if (a[i] < min) {
      min = a[i];
      loc = i;
    }
  }
  return loc;
}