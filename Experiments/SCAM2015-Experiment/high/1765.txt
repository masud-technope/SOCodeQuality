public class Combination {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("5278");
        String str;
        int lastIndex;

        if(builder.length() % 2 == 0) {
            lastIndex = builder.length() / 2;
        } else {
            lastIndex = builder.length() / 2 + 1;
        }
        str = builder.toString() + builder.toString().substring(0, lastIndex);

        for (int i = 0; i < builder.length(); i++) {
            System.out.println(str.substring(i, i + 3));
        }
    }
}