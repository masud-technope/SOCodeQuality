class B extends A implements I {
    public B(int bar) {
        this.super(bar);
    }

    public void methodI() {
        // whatever
    }

    @Override
    public B setFoo(int bar) {
       this.foo = bar;
       return this;
    }
}