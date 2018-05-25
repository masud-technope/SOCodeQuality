import java.util.BitSet;

class Yuk
{
  static boolean duplicatesZero(final int[] zipcodelist)
  {
    boolean duplicates=false;
    for (int j=0;j<zipcodelist.length;j++)
      for (int k=j+1;k<zipcodelist.length;k++)
        if (k!=j && zipcodelist[k] == zipcodelist[j])
          duplicates=true;

    return duplicates;
  }


  static boolean duplicatesOne(final int[] zipcodelist)
  {
    final int MAXZIP = 99999;
    boolean[] bitmap = new boolean[MAXZIP + 1];
    java.util.Arrays.fill(bitmap, false);
    for (int item : zipcodelist) {
      if (!(bitmap[item] ^= true))
        return true;
    }
    return false;
  }

  static boolean duplicatesTwo(final int[] zipcodelist)
  {
    final int MAXZIP = 99999;

    BitSet b = new BitSet(MAXZIP + 1);
    b.set(0, MAXZIP, false);
    for (int item : zipcodelist) {
      if (!b.get(item)) {
        b.set(item, true);
      } else
        return true;
    }
    return false;
  }

  enum ApproachT { NSQUARED, HASHSET, BITSET};

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    ApproachT approach = ApproachT.BITSET;

    final int REPS = 100;
    final int MAXZIP = 99999;

    int[] sizes = new int[] { 10, 1000, 10000, 100000, 1000000 };
    long[][] times = new long[sizes.length][REPS];

    boolean tossme = false;

    for (int sizei = 0; sizei < sizes.length; sizei++) {
      System.err.println("Trial for zipcodelist size= "+sizes[sizei]);
      for (int rep = 0; rep < REPS; rep++) {
        int[] zipcodelist = new int[sizes[sizei]];
        for (int i = 0; i < zipcodelist.length; i++) {
          zipcodelist[i] = (int) (Math.random() * (MAXZIP + 1));
        }
        long begin = System.currentTimeMillis();
        switch (approach) {
        case NSQUARED :
          tossme ^= (duplicatesZero(zipcodelist));
          break;
        case HASHSET :
          tossme ^= (duplicatesOne(zipcodelist));
          break;
        case BITSET :
          tossme ^= (duplicatesTwo(zipcodelist));
          break;

        }
        long end = System.currentTimeMillis();
        times[sizei][rep] = end - begin;


      }
      long avg = 0;
      for (int rep = 0; rep < REPS; rep++) {
        avg += times[sizei][rep];
      }
      System.err.println("Size=" + sizes[sizei] + ", avg time = "
            + avg / (double)REPS + "ms");
    }
  }

}