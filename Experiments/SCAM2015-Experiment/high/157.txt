class Outer
{
    String name;

    class Inner
    {
        void sayHi()
        {
            System.out.println("Outer name = " + name);
        }
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        outer.name = "Fred";

        Outer.Inner inner = outer.new Inner();
        inner.sayHi();
    }
}