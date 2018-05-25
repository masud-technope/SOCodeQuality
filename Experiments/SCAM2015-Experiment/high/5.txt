class Outer {
    void foo() {
        new Thread() {
            public void run() {
                Outer.this.bar();
            }
        }.start();
    }
    void bar() {
        System.out.println("BAR!");
    }
}