public class SingletonClassEarly {
    private static SingletonClassEarly sce = new SingletonClassEarly();
    private SingletonClassEarly() {} // make it private

    public static SingletonClassEarly getInstance() {
        return sce;
    }
}