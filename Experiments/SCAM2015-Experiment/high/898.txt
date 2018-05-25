private LongHashBag countTetragrams(String text) {

  // Homework assignment: find a good LongHashBag implementation, or
  // grab the LongIntHashMap implementation from Trove, and tweak it
  // to work as a Bag
  LongHashBag bag = new LongHashBag(500);

  // There are no tetragrams in this string.
  if (text.length() < 4) return bag;

  // Shortcut: if we calculate the first tetragram before entering
  // the loop, then we can use bit-shifting logic within the loop
  // to create all subsequent tetragram values.
  char[] c = text.toCharArray();
  long tetragram = ((long) c[0] << 48) |
     (((long) c[1]) << 32) |
     (((long) c[2]) << 16) |
     ((long) c[3]);

  bag.add(tetragram);

  for (int i = 4, last = text.length(); i < last; i++) {
     // During each loop iteration, the leftmost 2-bytes are shifted
     // out of the tetragram, to make room for the 2-bytes from the
     // current character.
     tetragram = (tetragram << 16) | ((long) c[i]);
     bag.add(tetragram);
  }

  return bag;
}