while (true) {
    System.out.println("\nPlease enter the floor you are on: ");
    current_Floor = in.nextInt();   
    if (current_Floor <= MAX_FLOORS) {
        break;
    }

    // This prints only if the user entered a bad number.
    System.out.println("Please enter a floor which is less than 8");
}