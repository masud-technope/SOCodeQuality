int linenumber = 0;
String tmp = new String();
while ((tmp = lnr.readLine()) != null) {
    linenumber++;
    System.out.println(tmp);
}