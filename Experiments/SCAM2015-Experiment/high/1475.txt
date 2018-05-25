Object LOCK = new Object(); // just something to lock on

synchronized (LOCK) {
    while (path != null) {
        try { LOCK.wait(); }
        catch (InterruptedException e) {
            // treat interrupt as exit request
            break;
        }
    }
}