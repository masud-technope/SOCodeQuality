import java.util.*;

public class Test {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Vector<String> vector = new Vector<String>();
    for (int i = 0; i < 300000; i++) {
      vector.add("dummy value");
    }
    long end = System.currentTimeMillis();
    System.out.println("Time taken: " + (end - start) + "ms");
  }
}