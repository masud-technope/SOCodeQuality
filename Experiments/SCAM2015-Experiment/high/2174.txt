public static void main(String[] args) {
    Scanner scan = null;
    try {
        scan = new Scanner(new File("textfile.txt"));
        // other I/O operations here including anything that uses scan
    } catch (FileNotFoundException e) {
        System.out.println("helpful error message", e);
    }
 }