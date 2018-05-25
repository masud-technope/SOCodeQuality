public class Cenas {

    public static int x = 0;
    public static int integer;

    public static int intconvert(String numb, int index, int times) {
        integer = Integer.parseInt(Character.toString(numb.charAt(index))); //
        x += integer * times; // add int and multiply it
        if (index == 0) { return x; }
        return intconvert(numb, --index, times * 10); //

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String digit: ");
        String number = scan.nextLine();
        System.out.println(intconvert(number, number.length() - 1, 1));
}