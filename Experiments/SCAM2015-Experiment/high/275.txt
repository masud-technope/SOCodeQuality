public class Base
{
   Base() {
       preProcess();
   }

   void preProcess() {}
}


public class Derived extends Base
{
   public String whenAmISet = "set when declared";

   @Override void preProcess()
   {
       whenAmISet = "set in preProcess()";
   }
}