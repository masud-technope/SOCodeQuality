private static final Comparator<Number> NUMBER_COMPARATOR = new Comparator<Number>() {
    private BigDecimal createBigDecimal(Number value) {
        BigDecimal result = null;
        if (value instanceof Short) {
            result = BigDecimal.valueOf(value.shortValue());
        } else 
        if (value instanceof Long) {
            result = BigDecimal.valueOf(value.longValue());             
        } else 
        if (value instanceof Float) {
            result = BigDecimal.valueOf(value.floatValue());                                
        } else 
        if (value instanceof Double) {
            result = BigDecimal.valueOf(value.doubleValue());                               
        } else 
        if (value instanceof Integer) {
            result = BigDecimal.valueOf(value.intValue());                              
        } else {
            throw new IllegalArgumentException("unsupported Number subtype: " + value.getClass().getName());
        }
                       assert(result != null);

        return result;
    }

    public int compare(Number o1, Number o2) {
        return createBigDecimal(o1).compareTo(createBigDecimal(o2));
    };
};

public static void main(String[] args) {
    Number i = Integer.valueOf(5);
    Number j = Double.valueOf(7);
              // -1
    System.out.println(NUMBER_COMPARATOR.compare(i, j));

         i = Long.MAX_VALUE;
         j = Long.valueOf(7);
              // +1
         System.out.println(NUMBER_COMPARATOR.compare(i, j));

         i = Long.MAX_VALUE;
         j = Long.valueOf(-7);
              // +1
         System.out.println(NUMBER_COMPARATOR.compare(i, j));

         i = Long.MAX_VALUE;
         j = Double.MAX_VALUE;
              // -1
         System.out.println(NUMBER_COMPARATOR.compare(i, j));

    i = Long.MAX_VALUE;
    j = Long.valueOf(Long.MAX_VALUE - 1);
    // +1
    System.out.println(NUMBER_COMPARATOR.compare(i, j));

              // sorting Long values
    Long[] values = new Long[] {Long.valueOf(10), Long.valueOf(-1), Long.valueOf(4)};
    Arrays.sort(values, NUMBER_COMPARATOR);
              // [-1, 4, 10] 
    System.out.println(Arrays.toString(values));  
}