public static class FRexpResult
{
   public int exponent = 0;
   public double mantissa = 0.;
}

public static FRexpResult frexp(double value)
{
   final FRexpResult result = new FRexpResult();
   long bits = Double.doubleToLongBits(value);
   double realMant = 1.;

   // Test for NaN, infinity, and zero.
   if (Double.isNaN(value) || 
       value + value == value || 
       Double.isInfinite(value))
   {
      result.exponent = 0;
      result.mantissa = value;
   }
   else
   {

      boolean neg = (bits < 0);
      int exponent = (int)((bits >> 52) & 0x7ffL);
      long mantissa = bits & 0xfffffffffffffL;

      if(exponent == 0)
      {
         exponent++;
      }
      else
      {
         mantissa = mantissa | (1L<<52);
      }

      // bias the exponent - actually biased by 1023.
      // we are treating the mantissa as m.0 instead of 0.m
      //  so subtract another 52.
      exponent -= 1075;
      realMant = mantissa;

      // normalize
      while(realMant > 1.0) 
      {
         mantissa >>= 1;
         realMant /= 2.;
         exponent++;
      }

      if(neg)
      {
         realMant = realMant * -1;
      }

      result.exponent = exponent;
      result.mantissa = realMant;
   }
   return result;
}