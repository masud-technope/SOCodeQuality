class Checker {
  private Holder h;
  public Checker() {
   h = new Holder(42);
  }

  public void check() {
    h.assertSanity();
  }

  public void create(int n) {
   h = new Holder(n);
   }

}

public class MyThread extends thread{
  private bool check;
  private final Checker c;
  public MyThread(bool check,Checker c) {
    this.check = check;
    this.c = c;
  }
    public static void main(String[] args) {
      Checker c = new Checker();
      MyThread t1 = new MyThread(false,c);  
      MyThread t2 = new MyThread(true,c);
      t1.start();
      t2.start();
      t1.join();
      t2.join();
   }
   public void run() {
     int n = 0;
     while(true) {
       if(check) 
         c.check();
       else
         c.create(n++);
    }
   }
 }
}