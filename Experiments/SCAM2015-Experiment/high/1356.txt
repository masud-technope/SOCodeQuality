public class B extends A{
public void testArgs(A a){ // <-- note how this is A a, not B a 
    System.out.println("B");
}
public void test(){
    System.out.println("B");
}
}