public static String toNumeralString(final Boolean input) {
  if (input == null) {
    return "null";
  } else {
    return input.booleanValue() ? "1" : "0";
  }
}