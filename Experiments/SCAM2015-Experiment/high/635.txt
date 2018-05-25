/** answer=hour+minutes/60+seconds/3600 */
public double convertHourToDecimal(String degree) { 
    if(!degree.matches("(-)?[0-6][0-9]\"[0-6][0-9]\'[0-6][0-9](.[0-9]{1,5})?")
        throw new IllegalArgumentException();
    String[] strArray=degree.split("[\"']");
    return Double.parseDouble(strArray[0])+Double.parseDouble(strArray[1])/60+Double.parseDouble(strArray[2])/3600;
}