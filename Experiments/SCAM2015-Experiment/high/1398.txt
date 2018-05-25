public static LocalDate getNDayOfMonth(int dayweek,int nthweek,int month,int year)  {
   LocalDate d = new LocalDate(year, month, 1).withDayOfWeek(dayweek);
   if(d.getMonthOfYear() != month) d = d.plusWeeks(1);
   return d.plusWeeks(nthweek-1);
}

public static LocalDate getLastWeekdayOfMonth(int dayweek,int month,int year) {
   LocalDate d = new LocalDate(year, month, 1).plusMonths(1).withDayOfWeek(dayweek);
   if(d.getMonthOfYear() != month) d = d.minusWeeks(1);
  return d;
}

public static void main(String[] args) {
   // second wednesday of oct-2011
   LocalDate d = getNDayOfMonth( DateTimeConstants.WEDNESDAY, 2, 10, 2011);
   System.out.println(d);
   // last wednesday of oct-2011
   LocalDate dlast = getLastWeekdayOfMonth( DateTimeConstants.WEDNESDAY,  10, 2011);
   System.out.println(dlast);
}