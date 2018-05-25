abstract class Parent<T extends Parent<T>> {
  public abstract T copy();
}

class Child extends Parent<Child> {
  public Child copy() {
    return new Child();
  }
}