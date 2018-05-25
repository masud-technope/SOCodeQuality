public class DupableExample {

    interface Dupable<T> {
        T dup();
    }   
    static class Sheep implements Dupable<Sheep> {
        Sheep(Sheep sheep) { }
        @Override public Sheep dup() {
            return new Sheep(this);
        }
    }
    public static void main(String[] args) {
        Dupable<?> dupable = new Sheep(null);
        System.out.println(dupable);
        System.out.println(dupable.dup());

        // no cast needed
        Sheep dolly2 = new Sheep(null).dup();
    }
}