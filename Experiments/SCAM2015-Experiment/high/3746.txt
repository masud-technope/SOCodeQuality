MyProgressListener extends ProgressListener {

     public Downloader downloader;
     public void onProgress(int n) {
         Thread t = new Thread() {
             @Override
             public void run() {
                 synchronized(downloader) {
                     // do something ...
                 }
             }
         };
         t.start();
         t.join();
     }
}