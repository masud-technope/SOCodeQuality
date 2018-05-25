public abstract class Abstraction() {
   protected int number = 0;
   public void printNumber() {
       System.out.println(this.number);
       System.out.println(getNumber());
   }
   public int getNumber() {
       return this.number();
   }
}

public class Reality extends Abstraction {
   int number = 1;
   public Reality() {
       System.out.println(number); //Will print 1
       System.out.println(this.number); //Will print 1
       System.out.println(super.number); //Will print 0
   }
}