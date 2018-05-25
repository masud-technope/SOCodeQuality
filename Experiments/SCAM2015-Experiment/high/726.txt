public class MultiSerialExecutor {
    private final ExecutorService executor;

    public MultiSerialExecutor(int maxNumThreads) {
        executor = Executors.newFixedThreadPool(maxNumThreads);
    }

    public void addTaskSequence(List<Runnable> tasks) {
        executor.execute(new TaskChain(tasks));
    }

    private void shutdown() {
        executor.shutdown();
    }

    private class TaskChain implements Runnable {
        private List<Runnable> seq;
        private int ind;

        public TaskChain(List<Runnable> seq) {
            this.seq = seq;
        }

        @Override
        public void run() {
            seq.get(ind++).run(); //NOTE: No special error handling
            if (ind < seq.size())
                executor.execute(this);
        }       
    }