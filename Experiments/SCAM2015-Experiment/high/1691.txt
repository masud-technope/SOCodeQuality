public class MyBigDecimal extends BigDecimal {

      private static MathContext context = new MathContext(120, RoundingMode.HALF_UP);

      public MyBigDecimal(String s) {
           super(s, context);
      }
      public MyBigDecimal(BigDecimal bd) {
           this(bd.toString()); // (Calls other constructor)
      }
      ...
      public MyBigDecimal divide( BigDecimal divisor ){
           return new MyBigDecimal( super.divide( divisor, context ) );
      }
      public MyBigDecimal add( BigDecimal augend ){
           return new MyBigDecimal( super.add( augend ) );
      }
      ...
}