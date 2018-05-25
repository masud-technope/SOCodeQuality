public String getDate(){
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();

    return dateFormat.format(date);
}