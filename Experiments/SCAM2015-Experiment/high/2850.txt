public class Node<T> {
    private T value;

    public Node(T val) {
        Class<?> clazz = val.getClass();
        checkType(clazz);
        this.value = val;
    }

    public T evaluate() {
         return value;
    };

    private void checkType(Class<?> c) {
       if(c.getName().equals(Integer.class.getName())) {
        //...
       }
    }

}