public class UpdateableTreeSet<T extends Updateable> extends TreeSet<T> {

    // definition of updateable
    interface Updateable{ void update(Object value); }

    // constructors here
    ...

    // 'update' method; returns false if removal fails or duplicate after update
    public boolean update(T e, Object value) {
       if (remove(e)) {
           e.update(value);
           return add(e);
       } else { 
           return false;
       }
    }
}