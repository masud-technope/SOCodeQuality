public static int findMax(int[] a, int index){
    if (index > 0) {
        return Math.max(a[index], findMax(a, index-1))
    } 

   else {
        return a[0];
    }
}