public class A{

    String varA;
    public String getvarA() {
        return varA;
    }
    public void setvarA(String varA) {
        this.varA=varA;
    }
}

class B {
    String name = "abc";
    A objA = new A();

    B() {
        objA.setvarA(name);
    }
}