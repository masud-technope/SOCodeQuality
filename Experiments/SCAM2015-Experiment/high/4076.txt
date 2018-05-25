public static void main(String[] args) throws FileNotFoundException 
{
    FileOutputStream fos = new FileOutputStream("Squares.txt");
    try{           
        PrintWriter square = new PrintWriter(fos);     
        for(int i=1; i<=10; i++) {
            square.print(i+"\t"+(i*i));
        }
        square.close ();
    } 
    catch (Exception e) {
        System.out.print("Could not create/open file");
        System.exit(0);
    }
}