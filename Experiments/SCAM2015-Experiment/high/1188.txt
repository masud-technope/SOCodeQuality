boolean isRegex;
try {
  Pattern.compile(input);
  isRegex = true;
} catch (PatternSyntaxException e) {
  isRegex = false;
}