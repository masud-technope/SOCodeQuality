long timestamp = 1245613885;
Calendar calendar = Calendar.getInstance();
calendar.setTimeZone(TimeZone.getDefault());
calendar.setTimeInMillis(timestamp * 1000);

int year = calendar.get(Calendar.YEAR);
int day = calendar.get(Calendar.DATE);
int hour = calendar.get(Calendar.HOUR_OF_DAY);
int minute = calendar.get(Calendar.MINUTE);