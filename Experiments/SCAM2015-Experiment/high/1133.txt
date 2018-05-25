public enum First implements SomeInterface {
  ONE,
  TWO {
    @Override
    public void doSomething() { // do something specific to TWO }
  },
  THREE;
  @Override
  public void doSomething() { // general solution for all values of First }
};