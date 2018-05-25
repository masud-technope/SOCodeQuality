public class Data {
  // Again, getters/setters, but at least these are final, that's an improvement
  public final int[] array1;
  public final int[] array2;

  public Data() {
    array1 = new int[5];
    array2 = new int[5];
  }
}

public class Demo {
  public static void main(String[] args)  {
    Data data = new Data();
    System.out.println(data.array1.length+" "+data.array2.length);
  }
}