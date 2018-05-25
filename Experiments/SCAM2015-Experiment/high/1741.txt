public void doSomeAsync(){
   Thread th = new Thread(new Runnable(){
      public void run(){
          Thread.sleep(500);
      }
   });
   th.start();
   //do something else quickly
}