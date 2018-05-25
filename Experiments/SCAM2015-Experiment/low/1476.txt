public class simpleMath
    {


        public static void main(String[] args) 
        {
            double number = 5;
            double answer = half(number);

            System.out.println(" 5 divided by 2 is:"+ answer);

        }

        private static double half(double number) {
             number =  number/2.0;
             return number;
        }

    }