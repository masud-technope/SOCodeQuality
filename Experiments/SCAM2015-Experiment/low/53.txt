char array[] = new char[4];
for (char c0 = 'a'; c0 <= 'z'; c0++) {
  array[0] = c0;
  for (char c1 = 'a'; c1 <= 'z'; c1++) {
    array[1] = c1;
    for (char c2 = 'a'; c2 <= 'z'; c2++) {
      array[2] = c2;
      for (char c3 = 'a'; c3 <= 'z'; c3++) {
        array[3] = c3;
        String s = new String(array);
        System.out.println(s);
      }
    }
  }
}