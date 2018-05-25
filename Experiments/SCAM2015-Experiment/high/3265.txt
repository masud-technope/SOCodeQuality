public void tryStart() {
    synchronized(source) { // try to obtain source lock
        try {
            Thread.sleep(5000); // lock it for 5 seconds.
        }
        catch(Exception ignore) {
            // You'll need to decide what to do if something interrupts the thread while it's "sleeping" (ie. locked) on the source airfield. Normally, this should not happen.
        }
    }
    // After 5 seconds, releases lock on airfield "source" and Plane starts flying
}