String[] tokens;
try {
    scanner = new Scanner(new File ("text.txt"));
    while (scanner.hasNextLine())       // change this
    { 
         tokens = scanner.nextLine().split(","); 
         System.out.println(tokens.length); 
     }
} catch (IOException e) {
    e.printStackTrace();
}