SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
try {
    // Get the start time..
    Date start = sdf.parse("09:00 AM");
    System.out.println(sdf.format(start));
} catch (ParseException ex) {
    ex.printStackTrace();
}