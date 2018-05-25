public class Part3 {
    public static void main (String args [])  {
        Scanner sc = new Scanner(System.in);
        int number;
        int factor=1;
        System.out.println("Enter a number to find the factorial of it: ");
        number= sc.nextInt();
        factor=factorial(number);
        System.out.println("The factorial of  "+number+" is = " +factor);
    }
    public static int factorial (int number) {
        int result = 1;
        if (number < 1 || number > 10)
            System.out.println("Invalid!! the number has to be between 1 and 10");
        else  {
            for(int x=1; x<=number; x++ ) {
                result= result*x;
            }
        }
        return result;
    }
}