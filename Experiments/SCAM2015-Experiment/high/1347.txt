public class Main {

    public static void main(String[] args) {
        String csv = "145557;123456789012;Michael Robert;1000000;200000;;12/05/2011;;" ;
        System.out.println(getColumnAt(csv, 0));
        System.out.println(getColumnAt(csv, 1));
        System.out.println(getColumnAt(csv, 2));
    }

    public static String getColumnAt(String csv, int column) {
        int fromIndex = 0;
        int col = 0;
        while (col < column) {
            fromIndex = csv.indexOf(";", fromIndex) + 1;
            col++;
        }
        int toIndex = csv.indexOf(";", fromIndex);
        return csv.substring(fromIndex, toIndex);
    }
}