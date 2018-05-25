private boolean isPalindrome(int possiblePalindrome) {
    String stringRepresentation = String.valueOf(possiblePalindrome);
    if ( stringRepresentation.equals(stringRepresentation.reverse()) ) {
       return true;
    }
}