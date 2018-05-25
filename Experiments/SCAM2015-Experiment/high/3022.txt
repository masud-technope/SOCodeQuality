long result = dateTo.getTime() - (1000 * 60 * 60 * 24 * 45) - dateFrom.getTime();
if(result >= 0) {
 System.out.println("dateFrom is 45 days or more before dateTo");
else {
 System.out.println("dateFrom is less than 45 days before dateTo");
}