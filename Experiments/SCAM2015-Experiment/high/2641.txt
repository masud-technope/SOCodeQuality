public boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return false; //not prime
        }
    }
    return true; //prime
}