public static void translate(StringBuilder str, char[] table)
  {
    for (int idx = 0; idx < str.length(); ++idx) {
      char ch = str.charAt(idx);
      if (ch < table.length) {
        ch = table[ch];
        str.setCharAt(idx, ch);
      }
    }
  }