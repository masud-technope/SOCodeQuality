public static String escape(String text) { 
    if(text == null) {
        return null;
    }

    int numChars = text.length();
    char ch;
    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < numChars; i++) {
        ch = text.charAt(i);

        switch(ch) {
            case '\\':  { sb.append("\\\\"); break; }
            case '\r':  { sb.append("\\r"); break; }
            case '\b':  { sb.append("\\b"); break; }
            case '\t':  { sb.append("\\t"); break; }
            case '\n':  { sb.append("\\n"); break; }
            case '\f':  { sb.append("\\f"); break; }
            default: {
                sb.append(ch);
                break;
            }
        }
    }
    return sb.toString();
}