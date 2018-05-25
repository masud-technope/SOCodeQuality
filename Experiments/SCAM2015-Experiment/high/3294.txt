Date date = new Date();
System.out.println(date);
System.out.println(DateFormat.getDateTimeInstance().format(date));
System.out.println(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(date));
System.out.println(DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(date));
System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(date));