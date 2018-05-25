void setup() {
     int i = 0;
     int sum = 0;
     int counter = 0;

     while (sum < 1768) {
         sum += i;
         i += 2;
         counter++;
     }

     System.out.println(counter);
 }