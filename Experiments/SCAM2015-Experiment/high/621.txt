int myNum = 0;

try {
    myNum = Integer.parseInt(et.getText().toString());
} catch(NumberFormatException nfe) {
   System.out.println("Could not parse " + nfe);
}