class A {
  B b;
  A() {
    b = new B(this);//<-- A's instance
  }
}

class B {
  A a;
  B(A a) {
    this.a = a;
  }
}