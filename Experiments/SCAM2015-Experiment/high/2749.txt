String target = "1904/01/01 12:00 AM";  // Your given date string
long nanoseconds = ...;   // nanoseconds since target time that you want to convert to java.util.Date

long millis = TimeUnit.MILLISECONDS.convert(nanoseconds, TimeUnit.NANOSECONDS); 

DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm aaa");
formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
Date date = formatter.parse(target);

long newTimeInmillis = date.getTime() + millis;

Date date2 = new Date(newTimeInmillis);

System.out.println(date2);