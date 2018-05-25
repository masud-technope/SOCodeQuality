public class Collate{
    String result;
    String a;
    String b;

    public void main(String[] args){
        System.out.printf("Enter 1st word: "); 
        Scanner in1 = new Scanner(System.in);
        a = in1.next();
        System.out.printf("Enter second word: ");
        Scanner in2 = new Scanner(System.in);
        b = in2.next();
        Collate collate = new Collate();
        String collation = collate.collate(a, b);
        System.out.println(collation);
        new Collate();
    }

    public String collate(String a, String b){
        String accumulator;
        this.a = a;
        this.b = b;


        for(int i = 0; i < a.length(); i++)
        {
            result += a.charAt(i);
            result += b.charAt(i);
        }
        return (result);
    }
}