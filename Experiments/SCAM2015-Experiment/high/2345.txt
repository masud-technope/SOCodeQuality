public static void main(String[] args) {
    String abcd1 = "/abcd/";
    String abcd2 = "/abcd";
    String abcd3 = "abcd/";
    String abcd4 = "abcd";
    System.out.println(abcd1.replaceAll("(^/)?(/$)?", ""));
    System.out.println(abcd2.replaceAll("(^/)?(/$)?", ""));
    System.out.println(abcd3.replaceAll("(^/)?(/$)?", ""));
    System.out.println(abcd4.replaceAll("(^/)?(/$)?", ""));
}