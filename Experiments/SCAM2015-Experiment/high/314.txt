public static void main(String[] args) {        
    Pattern p = Pattern.compile("\\\\\\\\"); //ERM, YEP: 8 OF THEM
    String s = "\\\\";
    Matcher m = p.matcher(s);
    System.out.println(s);
    System.out.println(m.matches());
}

\\ //JUST TO MATCH TWO SLASHES :(
true