final String OLD_FORMAT = "dd/MM/yyyy";
final String NEW_FORMAT = "yyyy/MM/dd";

// August 12, 2010
String oldDateString = "12/08/2010";
String newDateString;

SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
Date d = sdf.parse(oldDateString);
sdf.applyPattern(NEW_FORMAT);
newDateString = sdf.format(d);