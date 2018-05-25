public class Test {
public static int x = 0;

public static void main(String[] args) throws InterruptedException{

    Runnable r1 = new Runnable() {
        public void run() {
            while(true){
            x = x + 1;
            System.out.println("increment x");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
    };

    Runnable r2 = new Runnable() {
        public void run() {
            while(true){
            System.out.println("x is "+x);
            }
        }
    };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();