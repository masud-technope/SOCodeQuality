public class Demo {
  public static void getData(int[] array1, int[] array2)  {
    array1 = new int[5];
    array2 = new int[5];
  }

  public static void main(String[] args)  {
    int[] array1 = null;
    int[] array2 = null;
    getData(array1, array2); 
    System.out.println(array1[0]); // line 11
  }
}