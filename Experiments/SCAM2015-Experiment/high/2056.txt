static String toBinary(int a){
    if(a==0) {
        return "";
    }
    else {
        return toBinary(a/2) + (a%2);
    }
}

public static void main(String[]args){
    System.out.println(toBinary(24));
}