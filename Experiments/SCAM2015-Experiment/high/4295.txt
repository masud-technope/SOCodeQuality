long millis = 330000;

System.out.printf("%THh%<tMm%<tSs%n", millis);

Calendar cal = Calendar.getInstance();
cal.set(Calendar.HOUR_OF_DAY, 0);
cal.set(Calendar.MINUTE, 0);
cal.set(Calendar.SECOND, 0);
cal.set(Calendar.MILLISECOND, 0);

cal.add(Calendar.MILLISECOND, (int) millis);

System.out.printf("%THh%<tMm%<tSs%n", cal);