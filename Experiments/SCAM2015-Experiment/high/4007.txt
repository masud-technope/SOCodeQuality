public void ZZZZ() {
  synchronized(this) {
    System.out.println("inside ZZZZ");

      XXXX(); // run-time exception
  }
}