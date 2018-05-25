DateFormat inputDF  = new SimpleDateFormat("EEE, d MMM yyyy H:m:s z");
DateFormat outputDF = new SimpleDateFormat("d MMM yyyy");

String input = "Mon, 14 May 2012 13:56:38 GMT";
Date date = inputDF.parse(input);
String output = outputDF.format(date);

System.out.println(output);