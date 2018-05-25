static double getNthPowerOfNumber(double originalNumber,
        int power) {


    if (power == 0) {
        return 1;
    }
    if (originalNumber == 0) {
        return 0;
    } else {
        originalNumber/=1/getNthPowerOfNumber(originalNumber, --power);

        return originalNumber;
    }



}