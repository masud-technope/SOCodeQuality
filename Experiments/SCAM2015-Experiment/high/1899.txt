private volatile Collection global = new HashSet(); // start threading after this
private final Object globalLock = new Object(); // final reference used for synchronization

void allUpdatesGoThroughHere(Object exampleOperand) {
  // My hypothesis is that this prevents operations in the block being re-ordered
  synchronized(globalLock) {
    Collection copy = new HashSet(global);
    copy.remove(exampleOperand);
    // Given my hypothesis, we should have a fully constructed object here. So a 
    // reader will either get the old or the new Collection, but never an 
    // inconsistent one.
    global = copy;    
  }
}