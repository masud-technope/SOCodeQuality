final String allOptions = "Swordsman,Sorcerer,Elementalist,Assassin,Sharpshooter";
List<String> options = Arrays.asList(allOptions.split(","));
//  construct the display message
String msg = "\nNow, what class would you like to play?\n";
// in general use a StringBuilder for this. += used for brevity only
for (int i = 0; i < options.size(); i++) msg += options.get(i) + ", ";
msg += options.get(options.size() - 1) + "?";