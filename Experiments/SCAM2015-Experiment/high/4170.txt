class A {
  private int foo;
  void baz(A b) { b.foo = 42; }
}

class B extends A { }

class T {
  void x() {
    B b = new B();
    b.baz(b);
  }
}