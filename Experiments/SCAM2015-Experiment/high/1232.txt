byte[] b1 = new byte[] {97, 98, 99};

String s1 = Arrays.toString(b1);
String s2 = new String(b1);

System.out.println(s1);        // -> "[97, 98, 99]"
System.out.println(s2);        // -> "abc";