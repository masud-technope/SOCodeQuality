public abstract class MyAbstractClass<T extends Animal> {
    private List<T> myAnimalList;
    public MyAbstractClass(List<T> animals) { myAnimalList = animals; }
    public List<T> getAnimalList() { return myAnimalList; }
    //etc.
}

public class MyCatClass extends MyAbstractClass<Cat> {
     public MyCatClass(List<Cat> cats) { super(cats); }
}
public class MySnakeClass extends MyAbstractClass<Snake> {
     public MySnakeClass(List<Snake> snakes) { super(snakes); }
     public ShedSkin() { getAnimalList().get(0).ShedSkin(); }
}