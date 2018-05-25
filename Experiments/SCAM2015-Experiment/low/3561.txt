// write
new PrintWriter("the-file-name.txt", "UTF-8").append("this string").close();

// read
String thisStr = new BufferedReader(new FileReader("the-file-name.txt")).readLine();
System.out.println(thisStr);