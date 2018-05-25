import java.util.concurrent.atomic.AtomicIntegerArray;

class SyncCharArray {

    final private char array [];
    final private AtomicIntegerArray locktable;

    SyncCharArray (char array[])
    {
      this.array = array;

      // create a lock table the size of the array
      // to track currently locked elements 
      this.locktable = new AtomicIntegerArray(array.length);
      for (int i = 0;i<array.length;i++) unlock(i);

    }

    void swap (int idx1, int idx2)
    {
      // return if the same element
      if (idx1==idx2) return;

      // lock element with the smaller index first to avoid possible deadlock
      lock(Math.min(idx1,idx2));
      lock(Math.max(idx1,idx2));

      char tmp = array[idx1];
      array [idx1] = array[idx2];
      unlock(idx1);
      array[idx2] = tmp;
      unlock(idx2);

    }

    private void lock (int idx)
    {
      // if required element is locked when wait ...
      while (!locktable.compareAndSet(idx,0,1)) Thread.yield();
    }

    private void unlock (int idx)
    {
      locktable.set(idx,0);
    }

}