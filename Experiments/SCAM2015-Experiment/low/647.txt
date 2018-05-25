import java.util.*;
 import java.lang.*;

 public class Rock implements GameObject //Need to be an instance of GameObject somehow!
 {
 public static void main(String args[])
     {

     }

 public boolean beats(GameObject object) //This isn't static anymore
 {
 boolean result = false; //Need to declare and initialize result
 if (((Object)object).getClass().getName().equals("Rock")) //getClass should have ()
     { 
     result = false;
     }
 else if (object.getClass().getName().equals("Paper")) //getClass should have ()
     {
     result = false;
     }
 else if(object.getClass().getName().equals("Scissors")) //getClass should have ()
     {
     result = true;
     }
return result;
 }
 }