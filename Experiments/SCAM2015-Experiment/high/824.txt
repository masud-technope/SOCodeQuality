static boolean duplicates(final int[] zipcodelist)
{
   final int MAXZIP = 99999;
   boolean[] bitmap = new boolean[MAXZIP+1];  // Java guarantees init to false
   for (int item : zipcodeList)
     if (!(bitmap[item] ^= true)) return true;
   return false;
}