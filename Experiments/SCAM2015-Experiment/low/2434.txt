class OuterClass {
    void method() { }

    class InnerClass {
        void method() {
            OuterClass.this.method(); // not the same as method().
        }
    }
 }