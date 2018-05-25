public boolean prefixAgain(String str, int n) {
    boolean result = false;
    if (n < str.length() && 
            (str.substring(1)).indexOf(str.substring(0,n)) > -1
            ) {
        result = true;
    }
    return result;
}