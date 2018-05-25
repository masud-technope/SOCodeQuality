public String plusOut(String str, String word) {
  return str.replaceAll(
    String.format("(?<!(?=\\Q%s\\E).{0,%d}).", word, word.length()-1),
    "+"
  );  
}