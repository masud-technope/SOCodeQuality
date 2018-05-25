Comparator<String> comparator = new Comparator<String>() {

     @Override
     public int compare(String arg1, String arg2) {

         if (arg1.matches("^.*_locked$") && arg2.matches("^.*_locked$")) {
             // Both string have _locked at the end. Retain the order.
             return 0;
         } else if (arg1.matches("^.*_locked$")) {
             // First string have _locked. Swap.
             return 1;
         } else if (arg2.matches("^.*_locked$")) {
             // Second string have _locked. No need to swap
             return -1;
         } 

         // None of the string have _locked. Retain the order
         return 0;

     }
};

Collections.sort(list, comparator);