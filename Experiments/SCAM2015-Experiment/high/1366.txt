final DateTime input = new DateTime();
System.out.println(input);
final DateMidnight startOfLastWeek = 
    new DateMidnight(input.minusWeeks(1).withDayOfWeek(DateTimeConstants.MONDAY));
System.out.println(startOfLastWeek);
final DateMidnight endOfLastWeek = startOfLastWeek.plusDays(6);
System.out.println(endOfLastWeek);