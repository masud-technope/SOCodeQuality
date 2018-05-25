public class Test
{
  public static void main(String args[]) {

    long value1 = System.currentTimeMillis();
    for(long i=0;i<100000000;i++)
    {
        "abcd".indexOf("a");
    }
    long value2 = System.currentTimeMillis();
    System.out.println(value2-value1);


    value1 = System.currentTimeMillis();
    for(long i=0;i<100000000;i++)
    {
        "abcd".startsWith("a");
    }
    value2 = System.currentTimeMillis();
    System.out.println(value2-value1);
  }
}