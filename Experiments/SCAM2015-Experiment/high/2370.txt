@SuppressWarnings("unchecked")
static <T extends Foo> T getFoo() {
    //unchecked cast - ClassCastException is not thrown here if T is wrong
    return (T)new Foo2();
}

public static void main(String[] args) {
    Foo1 foo1 = getFoo(); //ClassCastException is thrown here
}