String[] myArray = {"AAAA", "BBBB", "CCCC"};
String[] myNewArray = new String[myArray.length];
for (int i=0; i<myArray.length; i++) {
    char c = (char) Integer.parseInt(myArray[i], 16);
    myNewArray[i] = String.valueOf(c);
}