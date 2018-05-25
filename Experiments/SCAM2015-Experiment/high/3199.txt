void create(){
    String s=null;
    s =edit(); // passing a string to edit now have no sense
    System.out.println(s);
}
// calling edit to this method have no sense anymore 
String edit(){
    return "hallo"; 
}