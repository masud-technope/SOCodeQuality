public static void main(String[] args) {    
    final String myString = "Logged in as: MyUserName (Administrator)";
    final Pattern pattern = Pattern.compile("^[^:]++:\\s*+(\\S++).*+$");
    final Matcher matcher = pattern.matcher(myString);
    if(matcher.matches()) {
        System.out.println(matcher.group(1));
    }
}