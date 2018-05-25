private static final List<Character> SPECIAL = Arrays.asList('.', /* etc */);

public static String escape(final String input)
{
    final StringBuilder sb = new StringBuilder(input.length());
    final CharBuffer buf = CharBuffer.wrap(input);
    char c;

    while (buf.hasRemaining()) {
        c = buf.get();
        if (SPECIAL.contains(c))
            sb.append('\\');
        sb.append(c);
    }

    return sb.toString();
}