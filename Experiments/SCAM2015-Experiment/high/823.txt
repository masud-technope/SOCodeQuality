static boolean duplicates(final int[] zipcodelist)
{
   final int MAXZIP = 99999;
   boolean[] bitmap = new boolean[MAXZIP+1];
   java.util.Arrays.fill(bitmap, false);
   for (int item : zipcodeList)
     if (!bitmap[item]) bitmap[item] = true;
     else return true;
   }
   return false;
}