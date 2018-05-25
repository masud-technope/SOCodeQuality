private boolean hasNextLine() throws IOException {
    while (System.in.available() == 0) {
        // [variant 1
        try {
            Thread.currentThread().sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted.. breaking from loop");
            return false;
        }// ]

        // [variant 2 - without sleep you get a busy wait which may load your cpu
        //if (this.isInterrupted()) {
        //    System.out.println("Thread is interrupted.. breaking from loop");
        //    return false;
        //}// ]
    }
    return sin.hasNextLine();
}