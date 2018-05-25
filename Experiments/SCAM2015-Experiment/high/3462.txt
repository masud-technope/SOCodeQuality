// Initial input
System.out.println("\nPlease enter the floor you are on: ");
current_Floor = in.nextInt();

// Loop until the input is acceptable
while (current_Floor > MAX_FLOORS) {
    System.out.println("Please enter a floor which is less than 8");
    current_Floor = in.nextInt();   
}