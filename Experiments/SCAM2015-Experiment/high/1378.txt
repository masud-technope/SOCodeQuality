private int ukp( final int[] ar, final int cap ) {
    if ( ar.length == 1 ) {
        return ar[0] <= cap ? ar[0] : 0;
    } else {
        final int[] nar = new int[ar.length-1];
        System.arraycopy(ar, 1, nar, 0, nar.length);
        fint int item = ar[0];
        if ( item < cap ) {
            final int left = ...  // fill me: we're not taking the item
            final int took = ...  // fill me: we're taking the item
            return Math.max(took,left);
        } else {
            return ... // fill me: we're not taking the item
        }
    }
}