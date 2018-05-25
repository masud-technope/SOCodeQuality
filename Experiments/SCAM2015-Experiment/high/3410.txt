double number = (double)17/3;
java.text.DecimalFormat number_format = new java.text.DecimalFormat("#.###");
number_format.setMaximumIntegerDigits(0);
System.out.println(number);
String formatted_string = number_format.format(number);
System.out.println(formatted_string);