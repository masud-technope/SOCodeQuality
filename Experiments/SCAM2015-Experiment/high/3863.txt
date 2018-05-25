boolean result = true;
for (String item : searchItems) {
    String pattern = ".*\\b" + item + "\\b.*";
    // by using the &&, result will be true only if text matches all patterns.
    result = result && text.matches(pattern);
}