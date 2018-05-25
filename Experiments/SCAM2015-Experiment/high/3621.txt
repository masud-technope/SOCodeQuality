package circle;

public class CircleTest {
  public static void main(String[] args) {
    Circle myCircle;

    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter radius");
    int radius = userInput.nextInt();

    myCircle = new Circle(radius);
    System.out.println("Circle radius is " + myCircle.getRadius());
    System.out.println("Circle diameter is " + myCircle.calculateDiameter());
    System.out.println("Circle circumference is "
        + myCircle.calculateCircumference());
    System.out.println("Circle area is " + myCircle.calculateArea());
  }
}