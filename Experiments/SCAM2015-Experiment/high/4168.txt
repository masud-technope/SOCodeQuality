class X{
  private static int i = 10;
  void f()     {
    Y oy = new  Y();
    oy.i = 5;  // Is this an error? Is i accessable through a reference to Y?
  }
}
class Y extends X {}