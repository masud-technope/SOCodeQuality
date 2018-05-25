ArrayList<String> names = new ArrayList<String>();
String userInput;
Scanner scanner = new Scanner(System.in);
while (true) {
    userInput = scanner.next();
    if (userInput.equals("done")) {
        break;
    } else {
        names.add(userInput);
    }
}       
scanner.close();