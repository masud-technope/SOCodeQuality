int count = 10;
int total = 20;
DecimalFormat dec = new DecimalFormat("#.00");
double rawPercent = ( (double)(count) / (double)(total) ) * 100.00;

double percentage = Double.valueOf(dec.format(rawPercent));

System.out.println("DF Version: " + dec.format(rawPercent));
System.out.println("double version: " + percentage);