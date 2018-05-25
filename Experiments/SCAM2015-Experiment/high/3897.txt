public class Average5 {

    public static void main(String args[]) {

        int numlenngth = 5;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        for (int num1 = 0; num1 < numlenngth; num1++) {
            System.out.print("Please enter a number: ");
            total += sc.nextInt();
        }

        System.out.println("Average : " + (total / numlenngth));

    }
}