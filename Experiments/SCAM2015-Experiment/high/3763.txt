class AI1 extends A implements I { }

class AI2 extends A implements I { }

public static void main(String[] args) {
    AISetWrapper aiSet = new AISetWrapper();
    aiSet.get().add(new AI1()); // compiles
    aiSet.get().add(new AI2()); // compiles
    aiSet.get().add(new A()); // does not compile
    aiSet.get().add(new I() {}); // does not compile
}