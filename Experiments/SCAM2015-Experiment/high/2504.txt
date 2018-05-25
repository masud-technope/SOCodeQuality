public static void main(String[] args) {

    String str = "Bobs big barbeque";
    String newStr = String.valueOf(str.charAt(0)).toLowerCase();
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == ' ') {
            newStr = newStr
                    + String.valueOf(str.charAt(i + 1)).toUpperCase();
            i = i + 1;
        }
        newStr = newStr + String.valueOf(str.charAt(i));
    }

    System.out.println(newStr);
}