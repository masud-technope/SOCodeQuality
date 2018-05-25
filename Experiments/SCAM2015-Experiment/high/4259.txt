//Java 7 and above
try {
  SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSX");
  Date date
  date = inputFormat.parse("2015-02-12T12:47:17.101+05:30");
  SimpleDateFormat outputFormat = new SimpleDateFormat("MMM_dd_yyyy");
  System.out.println(outputFormat.format(date));
}catch(Exception e){
  //cannot happen in this example
}