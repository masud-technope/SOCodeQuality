Calendar cal = Calendar.getInstance();
cal.set(Calendar.YEAR, 2014);
cal.set(Calendar.DAY_OF_YEAR, 1);    
Date start = cal.getTime();

//set date to last day of 2014
cal.set(Calendar.YEAR, 2014);
cal.set(Calendar.MONTH, 11); // 11 = december
cal.set(Calendar.DAY_OF_MONTH, 31); // new years eve

Date end = cal.getTime();

//Iterate through the two dates 
GregorianCalendar gcal = new GregorianCalendar();
gcal.setTime(start);
while (gcal.getTime().before(end)) {
    gcal.add(Calendar.DAY_OF_YEAR, 1);
    //Do Something ...
}