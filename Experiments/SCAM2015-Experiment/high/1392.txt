void main(){

    MyClass mc = new MyClass();
    List<object> results = new List<object>();
    object lock = new object();

    // Execute your thread and wait for it to complete
    Thread t = new Thread(new MyRunnable(mc, results, lock ));
    t.start();
    t.join();

    // Get the results
    for(object result:results)
    {
        // do something with the result
    }
}