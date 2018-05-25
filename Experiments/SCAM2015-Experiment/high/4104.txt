boolean valid;
String playerClass = "";
do
{
    valid = true; // reset each time
    // Class selection
    out.println("\nNow, what class would you like to play?\nSwordsman, Sorcerer, Elementalist, Assassin or Sharpshooter?");
    playerClass = classInput.nextLine();

    if (playerClass.equals("Swordsman")){
        out.println("You chose to be a Swordsman!");}
    else if (playerClass.equals("Sorcerer")){
        out.println("You chose to be a Sorcerer!");}
    ...
    else {
        System.out.println("Make sure your spelling is correct.");
        valid = false;
    }
} while (!valid);