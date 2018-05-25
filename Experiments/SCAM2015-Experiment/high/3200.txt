public class Test{

static class A{
 String s = "hello";

 @Override
 public String toString(){
   return s;
 }

}

public static void referenceChange(A a){
    a = new A(); // here a is pointing to a new object just like your example
    a.s = "bye-bye";
}

public static void modifyValue(A a){
   a.s ="bye-bye";// here you are modifying your object cuase this object is modificable not like Strings that you can't modify any property
}

public static void main(String args[]){
   A a = new A();
   referenceChange(a);
   System.out.println(a);//prints hello, so here you realize that a doesn't change cause pass by value!!
   modifyValue(a);
   System.out.println(a); // prints bye-bye 
}


}