public static BigInteger factorial(BigInteger n) {
    BigInteger result = BigInteger.ONE;

    while (!n.equals(BigInteger.ZERO)) {
        result = result.multiply(n);
        n = n.subtract(BigInteger.ONE);
    }

    return result;
}