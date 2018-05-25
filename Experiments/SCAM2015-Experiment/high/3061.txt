static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        return true;
    }
    return false;
 }