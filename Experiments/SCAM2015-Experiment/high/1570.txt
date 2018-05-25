public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date d = sdf.parse("02/02/1995");
    Date d2 = sdf.parse("01/01/1995");
    System.out.println(monthsBetween(d, d2));

}

public static double monthsBetween(Date baseDate, Date dateToSubstract){  

    Calendar cal = Calendar.getInstance();   
    cal.setTime(baseDate);
    int baseDayOfYear = cal.get(Calendar.DAY_OF_YEAR);  
    int baseMonth =  cal.get(Calendar.MONTH);  
    int baseYear = cal.get(Calendar.YEAR);  

    cal.setTime(dateToSubstract);  
    int subDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
    int subMonth =  cal.get(Calendar.MONTH);  
    int subYear = cal.get(Calendar.YEAR);  

    //int fullMonth = ((baseYear - subYear) * (cal.getMaximum(Calendar.MONTH)+1)) +    
    //(baseMonth - subMonth);  
    //System.out.println(fullMonth);

    return ((baseYear - subYear) * (cal.getMaximum(Calendar.MONTH)+1)) +   
           (baseDayOfYear-subDayOfYear)/31.0;
}