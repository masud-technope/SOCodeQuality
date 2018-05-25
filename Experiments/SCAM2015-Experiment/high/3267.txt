public void run(){
    while(true){
        tryStart(); // take off from source
        lecimy();   // fly the plane. Method will only return when plane reaches destination.
        tryLadowanie(); // land the plane
        source = dest;
        dest = Rand(source); // returns a new destination but can't be the same as source
    }
}


public void tryStart(){
    synchronized(source) {
        try {
            Thread.sleep(5000);
        }
        catch(Exception ignore) { }
    }
}

public void tryLadowanie(){
    synchronized(dest) {
        // land the plane
    }
}