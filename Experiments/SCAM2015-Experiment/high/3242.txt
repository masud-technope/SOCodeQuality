SimpleDateFormat format = new SimpleDateFormat("hhmm");
Dates tartDate = format.parse("0900");
Date endDate = format.parse("1730");
DateTime jdStartDate = new DateTime(startDate);
DateTime jdEndDate = new DateTime(endDate);
int hours = Hours.hoursBetween(jdStartDate, jdEndDate).getHours();
int minutes = Minutes.minutesBetween(jdStartDate, jdEndDate).getMinutes();
minutes = minutes % 60;

System.out.println(hours + " hours " + minutes + " minutes");