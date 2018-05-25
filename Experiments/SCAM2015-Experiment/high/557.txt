void f(Object o) {
    Caster<?> c = new Caster(); 
    g(c.cast(o)); 
}

class Caster<T extends MySuperClass & MyInterface> {
    public T cast(Object o) {
        return (T) o;
    }
}