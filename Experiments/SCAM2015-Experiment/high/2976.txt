private Set<Integer> getRandoms(int max) {
  Set<Integer> randoms = new HashSet<Integer>();
  Random r = new Random();
  while (randoms.size() != max) {
    int possibleNumber = r.nextInt(46-1) + 1;
    randoms.add(possibleNumber); // This will check to see if the element is already there
  }
  return randoms;
}