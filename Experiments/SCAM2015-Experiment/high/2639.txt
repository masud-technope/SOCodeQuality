public class PrimeNumber {
    public static void main (String args[]) {
        for (int i = 50; i >= 2; i--) {
            boolean isPrime = true;
            for (int j = 2; j < i-1; j++) { //increment "j" not "i"
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    } 
}