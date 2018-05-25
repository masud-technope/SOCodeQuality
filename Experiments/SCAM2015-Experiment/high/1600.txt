private static String rotate( final char[] a, final int n ) {
    for(int i = 0; i < n; i++) {
        char tmp = a[a.length-1];
        for(int j = a.length-1; j >= 0; j--) {
            a[j] = j == 0 ? tmp : a[(j-1+a.length)%a.length];
        }
    }
    return new String(a);
}