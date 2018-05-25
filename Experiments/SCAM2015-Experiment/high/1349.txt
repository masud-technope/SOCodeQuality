int delay = 0;   // delay for - no delay
int period = 1800000;  // repeat every 1.8 mil milliseconds = 30 minutes
Timer timer = new Timer();

timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
            // Create file here
        }
    }, delay, period);