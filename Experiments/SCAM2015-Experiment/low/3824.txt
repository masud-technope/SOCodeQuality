public static String printStrings(String a,int b) {
    String s = "";
    for(int i = 1; i <= b; i++) {
        s=s+a+" ";    

    }
    return s;
   }

public static void main(String[] args) {
System.out.println(printStrings("abc",5));
}