if (s.length() == 0) {
    return stutterString;
} else {
    char ch = s.charAt(0);
    String tempString = String.valueOf(ch);
    stutterString += tempString + tempString;
    return stutter(s.substring (1));
}