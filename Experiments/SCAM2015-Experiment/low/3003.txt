public void displayReport() {
   System.out.printf("%-22s %-16s %-23s %-23s %s %n", "Soft Drink", "ID",
                     "Starting Inventory", "Final Inventory",
                     "# transaction");
   for(int i = 0; i < MAXSIZE; i++) {
       //change "%-22s %-16s %-23f %-23f %f %n" to the below
       //and names etc. to names[i] etc.
       System.out.printf("%-22s %-16s %-23d %-23d %d %n", names[i], ids[i],
                         startingInventory[i], finalInventory[i], 
                         transactionCounts[i]);

   }
}