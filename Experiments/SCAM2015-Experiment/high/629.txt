public class TotalMemory
{
    public static void main(String[] args)
    {
         System.out.println("Total Memory: "+Runtime.getRuntime().totalMemory());
         System.out.println("Free Memory: "+Runtime.getRuntime().freeMemory());
    }
}