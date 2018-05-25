public int getMax() // get maximum value
{
    int index = -1;
    if (nelems == 0) {
    return -1;
}
   long lngMax = arr[0];
   for (int j = 1; j < nelems; j++) {
       if (lngMax < arr[j]) {
           lngMax = arr[j];
           index = j;
       }
   }
   return index;
}