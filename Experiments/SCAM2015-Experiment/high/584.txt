public class Superclass
{
    public void foo(Object x) {}
}

public class Subclass extends Superclass
{
    public void foo(String y) {}
}
...
Subclass x = new Subclass();
Superclass y = x;

x.foo("hello"); // Calls Subclass.foo(String)
y.foo("hello"); // Calls Superclass.foo(Object)