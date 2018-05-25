class MyClass
{
    public Object doSomething()
    {
        // return the object
        return new Object();
    }
}

class MyRunnable implements Runnable
{
    private final MyClass _mc;
    private final object _lock;
    private final List<object> _results;

    public MyRunnable(MyClass mc, List<object> results, object lock)
    {
        _mc = mc;
        _lock = lock;
        _results = results;
    }

    public void run()
    {
        synchronized(_lock)
        {
            _results.add(_mc.doSomething());
        }
    }
}