while (true) {
    int mark = readMark(scanner, count);
    if (mark == -1) {
        break;
    }
    count++;
    total += mark;
}
// Now print out the average, etc

...

private static int readMark(Scanner scanner, int count) {
    System.out.println("Please enter mark " + count);
    while (true) {
        int mark = scanner.nextInt();
        if (mark >= -1 && mark <= 100) {
            return mark;
        }
        System.out.println("Invalid mark, please re-enter");
    }
}