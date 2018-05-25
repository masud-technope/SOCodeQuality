public class A {
 private B myB = new B();
 private String myUnformattedName = "some information";

 public String getFormattedInfo() {
   return myB.formatInfo(myUnformattedName);
 }
}