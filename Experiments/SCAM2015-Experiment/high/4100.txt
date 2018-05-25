public String orderDate(){
    if(!out){
        GregorianCalendar orderDay = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        return sdf.format(orderDay.getTime());
    } 
    return "";
}