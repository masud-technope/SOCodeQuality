long starttime = 0; // variable declared
//...
// for the first time, remember the timestamp
if (frameCount == 0) {
    starttime = System.currentTimeMillis();
}
// the next timestamp we want to wake up
starttime += (1000.0 / fps);
// Wait until the desired next time arrives using nanosecond
// accuracy timer (wait(time) isn't accurate enough on most platforms) 
LockSupport.parkNanos((long)(Math.max(0, 
    starttime - System.currentTimeMillis()) * 1000000));