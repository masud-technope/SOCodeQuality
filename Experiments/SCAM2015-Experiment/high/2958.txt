Scanner scan = new Scanner(System.in);
String read = scan.readLine();
String separator = UUID.randomUUID().toString();
String str = read + separator + "world";
String[] sets = str.split(separator);
System.out.println(sets[0] + sets[1]);