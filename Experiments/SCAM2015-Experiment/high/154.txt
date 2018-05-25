public class Foo
{
    public static void Bar()
    {
    }
}

public class Abc
{
    public void Test()
    {
        // Static methods in the same class and base classes
        // (and outer classes) are available, with no
        // qualification
        Def();

        // Static methods in other classes are available via
        // the class name
        Foo.Bar();

        Abc abc = new Abc();

        // This would *not* be legal. It being legal has no benefit,
        // and just allows misleading code
        // abc.Def();
    }

    public static void Def()
    {
    }
}