public class Greeter
{
   String inputName; 

   public Greeter (String inputName) {
     this.inputName = inputName;
   }

   public String greet()
   {
      return "Hello " + inputName;
   }
}