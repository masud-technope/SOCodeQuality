public static int monthsBetween(Date minuend, Date subtrahend){  

    Calendar cal = Calendar.getInstance();   
    cal.setTime(minuend);  
    int minuendMonth =  cal.get(Calendar.MONTH);  
    int minuendYear = cal.get(Calendar.YEAR);  
    cal.setTime(subtrahend);  
    int subtrahendMonth =  cal.get(Calendar.MONTH);  
    int subtrahendYear = cal.get(Calendar.YEAR);  

    return ((minuendYear - subtrahendYear) * (cal.getMaximum(Calendar.MONTH)+1)) +    
    (minuendMonth - subtrahendMonth);  
}