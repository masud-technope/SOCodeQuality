public static void transfer(Account from, Account to, double amount){
      Account first = from;
      Account second = to;
      if (first.compareTo(second) < 0) {
          // Swap them
          first = to;
          second = from;
      }
      synchronized(first){
           synchronized(second){
                from.withdraw(amount);
                to.deposit(amount);
           }
      }
 }