public class B
{
    private A a;
    private C c;

    public void methodB1()
    {
        c = new C(); // Added 
        a = c.methodC1(); // the problem was here  
    }

    public void methodB2()
    {
        a.methodA1();
    }
}