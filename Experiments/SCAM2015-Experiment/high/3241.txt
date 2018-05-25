SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm");
Date startDate = format.parse("10-05-2013 09:00");
Date endDate = format.parse("11-05-2013 17:30");

DateTime jdStartDate = new DateTime(startDate);
DateTime jdEndDate = new DateTime(endDate);

int years = Years.yearsBetween(jdStartDate, jdEndDate).getYears();
int days = Days.daysBetween(jdStartDate, jdEndDate).getDays();
int months =  Months.monthsBetween(jdStartDate, jdEndDate).getMonths();
int hours = Hours.hoursBetween(jdStartDate, jdEndDate).getHours();
int minutes = Minutes.minutesBetween(jdStartDate, jdEndDate).getMinutes();

System.out.println(hours + " hours " + minutes + " minutes");