public static void recursion(int a, int b) {
  // stop condition of recursion
  if (a == b) return;

  // printing of pattern
  for (int i = a - b; i > 0; i--) {
    System.out.print("O");
  }
  for (int j = 0; j < b; j++) {
    System.out.print("X");
  }
  System.out.println();

  // --a;
  ++b; // <-- this could be done in the recursion call below,
  recursion(a, b);
  // recursion(a, ++b); // <-- like that.
}