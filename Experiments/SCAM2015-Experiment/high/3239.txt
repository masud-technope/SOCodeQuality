// Create email text body for student who registered for an AP exam.

import java.util.Scanner;

class EmailText {

    public static void main(String args[]) {

        int numTests, cost;
        String email, first_name;
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        first_name = input.next();

        System.out.print("Enter student email: ");
        email = input.next();

        System.out.print("Enter number of tests ordered (1-9): ");
        numTests = input.nextInt();
        if(numTests < 10) {

            System.out.print("Did student qualify for fee waiver (y/n)? ");
            ch = input.next().charAt(0);

            if(ch == 'y') {
                cost = 5;
                PrintStuff(numTests, cost, email, first_name, "qualified for a fee waiver, ");
            }
            else if(ch == 'n') {
                cost = 89;
                PrintStuff(numTests, cost, email, first_name, "did not qualify for a fee waiver, ");
            } else {
                System.out.println("Please start again.");
            }
        }
    }

    public static void PrintStuff(int numTests, int cost, String email, String first_name, String fw_status) {
        int total = numTests * cost;

        System.out.println("** COPY/PASTE THIS DRAFT **");
        System.out.println("To: " + email);
        System.out.println("Subject: 2014 AP Test Receipt for " + first_name);
        System.out.println();
        System.out.println("Hi " + first_name + ",\n");
        System.out.println("Thank you for registering for the 2014 AP Exams!");
        System.out.println("According to our records, you ordered " + numTests + " tests.\n");
        System.out.println("Because you stated that you " + fw_status +
                "each test will cost you $" + cost + ".");
        System.out.println("Your total cost is $" + cost + " * " + numTests +
               " = $" + total + ".\n"); 
        System.out.println("Please submit your payment to the Student Store ASAP.\nThank you.\n");
    }
}