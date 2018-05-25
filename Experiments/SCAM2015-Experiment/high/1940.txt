public class ThreadManager {
    private static ThreadManager tm;
    private List<Thread> threads;

    public static ThreadManager get() {
        if(null == tm) {
            tm = new ThreadManager();
        }

        return tm;
    }

    private ThreadManager() {
        threads = new ArrayList<Thread>();
    }

    public int getCountOfAliveThreads() {
        int count = 0;
        for(Thread t : threads) {
            if(t.isAlive()) {
                count++;
            }
        }

        return count;
    }
}