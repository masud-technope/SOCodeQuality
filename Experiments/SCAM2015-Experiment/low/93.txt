protected static void escapeXMLSpecialCharactersAndWrite(Writer writer, String str) throws IOException {

    int len = str.length();
    for (int i = 0; i < len; i++) {
        char c = str.charAt(i);

        switch (c) {
        case '&':
            writer.write("&amp;");
            break;
        case '<':
            writer.write("&lt;");
            break;
        case '>':
            writer.write("&gt;");
            break;
        case '\"':
            writer.write("&quot;");
            break;
        case '\'':
            writer.write("&apos;");
            break;
        default:
            writer.write(c);
            break;
        }
    }
}