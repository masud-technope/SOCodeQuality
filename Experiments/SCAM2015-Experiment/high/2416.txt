private String param;
public Construct(String param) {
  // Usually the only place you need to use this.
  this.param = param;
}

// A less common use of this
public Function() {
  synchronized(this) {
    // Some synchronized stuff.
  }
}