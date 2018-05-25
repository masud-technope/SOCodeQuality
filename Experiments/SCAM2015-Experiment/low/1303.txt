public class Main {
                     int x=25;
                     int y =25;
                   //Go to next class second
                   aMethod(){
                    Second s = new Second();
                    s.manipulateValues(x,y);
                    }
                  }

public class Second {
                     //inherit values of x and y
                     //manipulate values 
                     //Go to next class third
                       public void manipulateValues(int x, int y){
                           //manipulate here  
                           Third t = new Third ();
                           s.manipulateHereToo(x,y);
                       }
                    }

public class Third {
                     //inherit values of x and y from second class
                     //manipulate values 
                      public void manipulateHereToo(int x, int y){
                             //manipulate again
                       }
                   }