Object o = new Object();            // Slot 0.
synchronized (o) {                  // Slot 1.
    byte[] data1 = new byte[size];  // Slot 2.
}                                 
int i = 0;                          // Slot 1.
synchronized (o) {                  // Slot 2. (clobbers data1, was slot 1)
    byte[] data2 = new byte[size];  // Slot 3.
}