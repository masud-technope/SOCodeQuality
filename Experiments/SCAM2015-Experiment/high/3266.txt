public void tryLadowanie() {
    synchronized(dest) { // try to obtain dest lock
        // successfully obtained lock.
        // perform your landing
    }
    // plane landed and releases "dest" resource for other planes (ie. threads)
}