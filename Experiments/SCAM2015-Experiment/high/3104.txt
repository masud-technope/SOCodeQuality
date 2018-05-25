System.out.printf("|%-30s|%5s|%n", "Aa", "1");
System.out.printf("|%-30s|%5s|%n", "Bbbb", "222");

String s = String.format("|%-30s|%5s|%n", "Aa", "1").replace(' ', '_');

String fortyBlanks = String.format("%40s", "");