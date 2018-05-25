//on button click

ThreadTest th1 = new ThreadTest(1, 0, obj);//here obj is YourClass
ThreadTest th2 = new ThreadTest(2, 65000, obj);//65 SECONDS
//... keep adding

Thread thread1 = new Thread(th1);
Thread thread2 = new Thread(th2);
//...keep adding

thread1.start();
thread2.start();
//...keep adding