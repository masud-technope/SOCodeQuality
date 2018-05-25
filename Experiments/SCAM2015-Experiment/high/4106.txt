boolean valid = false; 
String playerClass = "";
while (!valid)
{
    // Class selection
    out.println(msg);
    playerClass = classInput.nextLine();
    valid = options.contains(playerClass);
    if (!valid)
        System.out.println("Make sure your spelling is correct.");
}
out.println("You chose to be a " + playerClass + "!");