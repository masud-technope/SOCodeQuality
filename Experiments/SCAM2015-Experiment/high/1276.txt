/** the constant 2^64 */
private static final BigInteger TWO_64 = BigInteger.ONE.shiftLeft(64);

public String asUnsignedDecimalString(long l) {
   BigInteger b = BigInteger.valueOf(l);
   if(b.signum() < 0) {
      b = b.add(TWO_64);
   }
   return b.toString();
}