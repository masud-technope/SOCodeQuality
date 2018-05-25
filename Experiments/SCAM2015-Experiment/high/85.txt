private static class FooBarAdapter implements Foo, Bar {
  private final Object adaptee;
  FooBarAdapter(Object o) {
    adaptee = (Foo) (Bar) o;
  }
  public int flip() { return ((Foo) adaptee).flip(); }
  public void flop(int x) { ((Foo) adaptee).flop(x); }
  public void blort() { ((Bar) adaptee).blort(); }
}

public void problemFunction (Object o) {
  doSomething(new FooBarAdapter(o));
}