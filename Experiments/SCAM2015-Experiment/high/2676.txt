class Bar
    Bar doA()

class Foo extends Bar
    Foo doB();

foo.doA().doB(); // doesn't compile, since doA() returns Bar