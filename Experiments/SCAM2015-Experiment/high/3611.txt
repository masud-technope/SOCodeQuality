public class Holder {
  // Should really be private, with constructors/getters/setters
  // but for brevity we'll access them directly here.  Don't
  // take this shortcut in production code
  public int[] array1;
  public int[] array2;
}

public class Demo {
  public static void getData(Holder holder) {
    holder.array1 = new int[5];
    holder.array2 = new int[5];
  }

  public static void main(String[] args)  {
    Holder holder = new Holder();
    getData(holder);
    System.out.println(holder.array1.length+" "+holder.array2.length);
  }
}