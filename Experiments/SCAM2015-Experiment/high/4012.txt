System.out.println("What's the highest roll you want? \n");
while (!userin.hasNextInt()) {
    System.out.println("Please enter an integer.");
    userin.nextLine();
}
// Since we reached this point, userin.hasNextInt() has returned true.
// We are ready to read an integer from the scanner:
highnum = userin.nextInt();