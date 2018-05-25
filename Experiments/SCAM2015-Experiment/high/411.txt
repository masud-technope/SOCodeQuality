Calendar cal = Calendar.getInstance(); // locale-specific
cal.setTime(dateObject);
cal.set(Calendar.HOUR_OF_DAY, 0);
cal.set(Calendar.MINUTE, 0);
cal.set(Calendar.SECOND, 0);
cal.set(Calendar.MILLISECOND, 0);
long time = cal.getTimeInMillis();