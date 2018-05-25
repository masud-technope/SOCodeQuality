public class RegexExample{
    public static void main(String[] args) {
    String s = "firstWordWithSpaceAfter secondWordWithSpaceAfter wordWithLineBreakAfter\nlastWord";
    String sa[] = s.split("(?<=[ \\n])");
    for (String saa : sa )
        System.out.println("[" + saa + "]");
    }
}