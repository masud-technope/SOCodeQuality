public static void main(String[] args) {
  if (new java.util.HashSet<Integer>(
      Arrays.asList(new Integer[] { 0, 0, 0, 0 }))
      .size() == 1
      && new java.util.HashSet<Integer>(
          Arrays.asList(new Integer[] { 0, 0, 0, 0,
              0 })).size() == 1
      && new java.util.HashSet<Integer>(
          Arrays.asList(new Integer[] { 0, 0, 0, 0,
              0, 0, 0, 0 })).size() == 1) {
    System.out.println("All true");
  } else {
    System.out.println("Not true");
  }
}