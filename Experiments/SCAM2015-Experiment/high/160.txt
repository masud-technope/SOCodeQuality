public class FooHolder
{
    public static Foo f = null;

    public static void main(String[] args)
    {
        f = new Foo();
        System.out.println(f.fWasNull);
    }
}

// Make this nested if you like, I don't believe it affects the reasoning
public class Foo
{
    public boolean fWasNull;

    public Foo()
    {
        fWasNull = FooHolder.f == null;
    }
}