public class StringReplace {

    public static String replaceRange(String s, int start, int end){
        StringBuilder b = new StringBuilder(s);

        for(int i = start; i <= end; i++)
            b.setCharAt(i, 'x');

        return b.toString();
    }

    public static void main(String[] args){
        String test = "mystringtoreplace";
        String replaced = replaceRange(test, 3, 8);
        System.out.println(replaced);
    }

}