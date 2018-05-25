public class ArrayPrinting {

    public static <E> void printArray(E[] a){
        for(E x : a){
            System.out.print(x+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"A","B","C","D","E"};
        ArrayPrinting.printArray(a);
    }
}