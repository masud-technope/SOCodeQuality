public char change(char x) {
    final String dictionary = "abtr";
    final String transform = "bart";

    int loc= dictionary.indexOf(x);
    if (loc < 0) {
        return 'z';
    } else {
        return transform.charAt(loc);
    }
}