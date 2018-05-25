do {
    System.out.println("\nPlease enter the floor you are on: ");
    current_Floor = in.nextInt();   
} while( current_Floor > MAX_FLOORS );

{ // Useless braces!
    System.out.println("Please enter a floor which is less than 8");
} // Useless braces!