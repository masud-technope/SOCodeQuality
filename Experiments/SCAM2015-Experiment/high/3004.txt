int number;
do {
    String textinput = JOptionPane.showInputDialog("give me a number between 0 and 5");
    number = Integer.parseInt(textinput);
    if((number < 0) || (number > 5) {
        //show error message
        continue;  //continue isn't absolutely necessary here, but perhaps for readability
    }
} while (!(number >= 0 && number <= 5));