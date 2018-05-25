public class A {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        System.out.println(a);

        int bit=1;
        for(int i=0; i<32; i++) {
            System.out.print("  "+(((a&bit)==0)?0:1));
            bit*=2;
        }
    }
}