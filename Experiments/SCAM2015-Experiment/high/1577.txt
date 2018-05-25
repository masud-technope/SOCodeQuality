Scanner scanner = new Scanner(input);
if (scanner.hasNextInt())
    System.out.println(scanner.nextInt());
else if (scanner.hasNextDouble())
    System.out.println(scanner.nextDouble());
else
    System.out.println("Not a number");