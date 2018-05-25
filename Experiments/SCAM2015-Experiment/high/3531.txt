boolean validEntry;

do {
   try {
      System.out.println("Enter an integer number between 1 and 3999!");
      Scanner scan = new Scanner(System.in); 
      numArabic = scan.nextInt();
      validEntry = true;
   }
   catch (InputMismatchException e) {
      validEntry = false;
      System.out.println("Entered value is not an integer!");
   }
}
while(!validEntry);