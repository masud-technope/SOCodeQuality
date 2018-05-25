class ... {

  private final Random dice = new Random();

  public int rand(int i) {
    return dice.nextInt(i);
  }

}