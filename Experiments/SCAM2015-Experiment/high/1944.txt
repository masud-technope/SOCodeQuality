Thread t = new Thread(r) {
  public void run() {
    super.run();
    System.out.print("Dog");
  }
};