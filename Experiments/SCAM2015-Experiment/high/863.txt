public static Function<String, Integer> parseIntegerFunction() {
  return ParseIntegerFunction.INSTANCE;
}

private enum ParseIntegerFunction implements Function<String, Integer> {
  INSTANCE;

  public Integer apply(String input) {
    return Integer.valueOf(input);
  }

  @Override public String toString() {
    return "ParseIntegerFunction";
  }
}