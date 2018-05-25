SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
try {
    Date start = sdf.parse("09:00 AM");
    Calendar cal = Calendar.getInstance();
    cal.setTime(start);
    cal.add(Calendar.MINUTE, 45);
    Date end = cal.getTime();

    System.out.println(sdf.format(start) + " to " + sdf.format(end));
} catch (ParseException ex) {
    ex.printStackTrace();
}