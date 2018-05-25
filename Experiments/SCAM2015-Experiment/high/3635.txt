long timeMillis = /* get time milliseconds form the server */
Time time = new Time();
time.set(timeMillis);

/* changing time zone */
time.switchTimezone(/* your desired timezone in string format */);

/* getting time as string  */
String timeString = time.format("%Y%m%dT%H%M%S"); // you can change format as you wish