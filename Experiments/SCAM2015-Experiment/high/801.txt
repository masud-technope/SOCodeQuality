public static void main(String[] args) throws Exception {
    for (Locale locale : Locale.getAvailableLocales()) {
        DateFormat df = getShortDateInstanceWithoutYears(locale);
        System.out.println(locale + ": " + df.format(new Date()));      
    }
}

public static DateFormat getShortDateInstanceWithoutYears(Locale locale) {
    SimpleDateFormat sdf = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT, locale);
    sdf.applyPattern(sdf.toPattern().replaceAll("[^\\p{Alpha}]*y+[^\\p{Alpha}]*", ""));
    return sdf;
}