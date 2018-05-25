double input = 16.489;

// Math.round
System.out.println(Math.round(100 * input) / 100.0);

// Decimal format
System.out.println(new DecimalFormat("#.##").format(input));

// printf
System.out.printf("%.2f", input);