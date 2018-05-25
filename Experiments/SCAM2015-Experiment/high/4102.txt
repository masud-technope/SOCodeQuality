public DateAndTime orderTime(){
    String dateStore = "";
    String time = "";
    if(!out){
        GregorianCalendar orderDay = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
        time = timeFormat.format(new Date());
        // System.out.println (); 
        dateStore = sdf.format(orderDay.getTime());
    } 
    return new DateAndTime(dateStore, time);
}