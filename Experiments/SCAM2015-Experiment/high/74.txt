public static void translate(StringBuilder str, Map<Character, Character> table)
  {
    for (int idx = 0; idx < str.length(); ++idx) {
      char ch = str.charAt(idx);
      Character conversion = table.get(ch);
      if (conversion != null) 
        str.setCharAt(idx, conversion);
    }
  }