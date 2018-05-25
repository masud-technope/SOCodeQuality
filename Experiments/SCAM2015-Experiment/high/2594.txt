Pattern SUBST_Patt = Pattern.compile("\\{(\\w+)\\}");
StringBuilder sb = new StringBuilder( template);
Matcher m = SUBST_Patt.matcher( sb);
int index = 0;
while (m.find( index)) {
    String subst = m.group( 1);
    index = m.start();
    //
    String replacement = "replacement";       // .. lookup Subst -> Replacement here
    sb.replace( index, m.end(), replacement);
    index = index + replacement.length();
}