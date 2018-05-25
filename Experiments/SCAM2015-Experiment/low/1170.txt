private String correct(String src) {
    boolean found = false;
    String tag = "";
    for (int i = 0; i < src.length(); i++) {
        char c = src.charAt(i);
        if (Character.isDigit(c)) {
            tag += c;
        } else {
            if (found) {
                break;
            } else {
                found = true;
                tag += ".";
            }
        }
    }
    return tag;
}