public static Date subtractDay(Date date) {

    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.DAY_OF_MONTH, -1);
    return cal.getTime();
}