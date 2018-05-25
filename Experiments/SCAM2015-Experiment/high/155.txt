class Base
{
    static void foo()
    {
        System.out.println("Base.foo()");
    }
}

class Derived extends Base
{
    static void foo()
    {
        System.out.println("Derived.foo()");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Base b = new Derived();
        b.foo(); // Prints "Base.foo()"
        b = null;
        b.foo(); // Still prints "Base.foo()"
    }
}