public class Test
{
    enum Foo
    {
        BAR, BAZ
    }


    public static void main(String[] args)
    {
        @SuppressWarnings("rawtypes")
        Class cls = Foo.class;

        if (cls.isEnum())
        {        
            @SuppressWarnings("unchecked")
            Object value = Enum.valueOf(cls, "BAR");
            System.out.println(value);
        }
    }
}