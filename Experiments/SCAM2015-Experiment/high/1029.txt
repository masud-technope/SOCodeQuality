public class Foo {
  public static void main (String[] args) {
    System.out.println(Integer.valueOf(5000) == Integer.valueOf(5000));
    System.out.println(Integer.valueOf(5000) == new Integer(5000));
    System.out.println(Integer.valueOf(5000) == 5000);
    System.out.println(new Integer(5000) == Integer.valueOf(5000));
    System.out.println(new Integer(5000) == new Integer(5000));
    System.out.println(new Integer(5000) == 5000);
    System.out.println(5000 == Integer.valueOf(5000));
    System.out.println(5000 == new Integer(5000));
    System.out.println(5000 == 5000);
    System.out.println("=====");
    System.out.println(Integer.valueOf(5) == Integer.valueOf(5));
    System.out.println(Integer.valueOf(5) == new Integer(5));
    System.out.println(Integer.valueOf(5) == 5);
    System.out.println(new Integer(5) == Integer.valueOf(5));
    System.out.println(new Integer(5) == new Integer(5));
    System.out.println(new Integer(5) == 5);
    System.out.println(5 == Integer.valueOf(5));
    System.out.println(5 == new Integer(5));
    System.out.println(5 == 5);
    System.out.println("=====");
    test(5000, 5000);
    test(5, 5);
  }
  public static void test (Integer a, Integer b) {
    System.out.println(a == b);
  }
}