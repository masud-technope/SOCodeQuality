public static void main (String args[]){
    int leapYear = 2001; // initialize leapYear variable to 2001

    while (leapYear <= 2100){
        for (int x = 0; x < 10; x++){ // print ten leap years per line
            if (leapYear > 2100){ // if leapYear is over 2100, stop printing
                break;
            }
            System.out.print(leapYear + " ");
            leapYear = leapYear + 4;
        }// end of for loop
        System.out.println(" ");
        int x = 0;
    } // end of if statement

}// end of main method