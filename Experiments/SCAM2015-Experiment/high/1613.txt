private double findMax(double... vals) {
   double max = Double.NEGATIVE_INFINITY;

   for (double d : vals) {
      if (d > max) max = d;
   }

   return max;
}