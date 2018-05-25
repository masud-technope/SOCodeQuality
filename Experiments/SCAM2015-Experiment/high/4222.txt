public static void main(String[] args) {
               new PrintingTheads().doJob();
         }

      }



    class PrintingTheads{
        private    Object objsynch= new Object();
        private  int numberofZ = 0;

        public void doJob(){
            new Thread(){
                public void run(){

                    while(true){
                      System.out.print(1); Thread.yield(); // thread yeald is here for better "mixing the number 1,2 and Z letters"
                       System.out.print(2);Thread.yield();
                       synchronized (objsynch) {
                            while(numberofZ!=3) try{objsynch.wait(10);} catch(InterruptedException e){}

                        }

                       System.out.println(3);
                       try{Thread.sleep(1000);} catch(InterruptedException e){}  // * this part is only for easy to see what happened and can be deleted
                       synchronized (objsynch) {
                          numberofZ = 0;
                          objsynch.notifyAll();
                        }
                    }

                    }

             }.start();


             new Thread(){
                 public void run(){

                     while(true){
                        synchronized (objsynch) {
                            while(numberofZ!=0) try{objsynch.wait(10);} catch(InterruptedException e){}
                        }
                        for(int i= 0;i<3;i++) {System.out.print('z');Thread.yield();}

                        synchronized (objsynch) {
                          numberofZ=3;
                          objsynch.notifyAll();
                        }
                     }
                 }

             }.start();
        }
    }