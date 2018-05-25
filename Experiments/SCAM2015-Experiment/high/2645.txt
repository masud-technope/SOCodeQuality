public long getDifference()
{
    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
    Date d = sdf.parse("Mon May 27 11:46:15 IST 2013");

    Calendar c = Calendar.getInstance();
    c.setTime(d);
    long time = c.getTimeInMillis();
    long curr = System.currentTimeMillis();
    long diff = curr - time;    //Time difference in milliseconds
    return diff/1000;
}