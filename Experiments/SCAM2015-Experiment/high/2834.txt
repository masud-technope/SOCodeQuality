public class Giraffe {

private final Animal a;

public Giraffe(Animal a){
  this.a=a;
}

public void method1(){
  a.method1();
}

public Something drink(){
  return a.drink();
}
.
.
.
// and not implementing swim 
}