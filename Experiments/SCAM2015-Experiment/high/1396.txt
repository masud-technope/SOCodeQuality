private int nextLargestPalindrome(int fromNumber) {
    for ( int i = fromNumber + 1; ; i++ ) {
        if ( isPalindrome( i ) ) {
            return i;
        }
    }
}