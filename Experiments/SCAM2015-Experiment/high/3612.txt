import java.util.*;

public class Demo {
  public static void getData(List<Integer> ls1, List<Integer> ls2) {
    // bad formatting for brevity, don't do this either
    ls1.add(1); ls1.add(2); ls1.add(3); ls1.add(4); ls1.add(5); 
    ls2.add(1); ls2.add(2); ls2.add(3); ls2.add(4); ls2.add(5);
  }

  public static void main(String[] args)  {
    List<Integer> ls1 = new ArrayList<>();
    List<Integer> ls2 = new ArrayList<>();
    getData(ls1, ls2);
    System.out.println(ls1.size()+" "+ls2.size());
  }
}