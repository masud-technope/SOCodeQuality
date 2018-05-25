if (s.matches("(?sxi)" +
    "# Match string containing no 'bad' words.\n" +
    "^                # Anchor to start of string.\n" +
    "(?:              # Step through string one char at a time.\n" +
    "  (?!            # Negative lookahead to exclude words.\n" +
    "    \\b          # All bad words begin on a word boundary\n" +
    "    (?:          # List of 'bad' words NOT to be matched.\n" +
    "      Apt        # Cannot be 'Apt',\n" +
    "    | Bldg       # or 'Bldg',\n" +
    "    | Ste        # or 'Ste',\n" +
    "    | Unit       # or 'Unit'.\n" +
    "    )            # End list of words NOT to be matched.\n" +
    "    \\b          # All bad words end on a word boundary\n" +
    "  )              # Not at the beginning of bad word.\n" +
    "  .              # Ok. Safe to match this character.\n" +
    ")*               # Zero or more 'not-start-of-bad-word' chars.\n" +
    "$                # Anchor to end of string.")
    ) {
    // String has no bad words.
    System.out.print("OK: String has no bad words.\n");
} else {
    // String has bad words.
    System.out.print("ERR: String has bad words.\n");
}