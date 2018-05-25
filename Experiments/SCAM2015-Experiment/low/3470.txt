public static String reverse(String str) {
    String reversedString = ""; // this will be the reversed string

    // for every character started at the END of the string
    for (int i = str.length() - 1; i > -1; i--) {
        // add it to the reverse string
        reversedString += str.substring(i, i+1);
    }
    return reversedString.toUpperCase(); // return it in upper case
}