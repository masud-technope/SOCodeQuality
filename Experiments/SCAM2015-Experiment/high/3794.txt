public abstract class Parent {
    public abstract int getValue();
}

public class Child extends Parent {
    @Override
    public int getValue() {
        return 5;
    }
}

public static void main(String[] args) {
    Parent x = new Child();
    System.out.println(x.getValue());
}