private static int inputStudentNumber() {
  System.out.println("Enter the student number:");
  if (in.hasNextInt()) {
    return in.nextInt();
  } else {
    System.out.println("Invalid input, it can only be integer.");
    in.next(); // consume the token
    return inputStudentNumber();
  }
}