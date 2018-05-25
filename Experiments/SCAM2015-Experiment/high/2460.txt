Date date = new Date(System.currentTimeMillis()); // Prints 2013-03-08
Time time = new Time(System.currentTimeMillis()); // Prints 15:40:33

String myDate = date + " " + time;

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
java.util.Date utilDate = new java.util.Date();
try {
    utilDate = sdf.parse(myDate); // You get a Java Util Date object(Fri Mar 08 15:40:33 IST 2013)
} catch (ParseException pe) {
   // TODO something.
}

DateTime dateTime = new DateTime(utilDate); // You get your JODA object.