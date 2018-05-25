int number;
String textinput = JOptionPane.showInputDialog("give me a number between 0 and 5");
while(true) {
    number = Integer.parseInt(textinput);
    if((number >= 0 && number <= 5)) {
        //show error message and prompt for another input
        contine; //As with before, continue isn't necessary here, but could add readability
    } else /*input was good*/ { break; /*exit while loop*/ }
}