new Thread(new Runnable() {

    public void run() {
          final MyClass instance = new MyClass(10);
          new Thread(new Runnable() {
               public void run() {
                    instance.put("one", "one");
                      ....
               }

           }).start();
     }

}).start();