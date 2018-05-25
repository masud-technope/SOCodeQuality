package circle;

public class Circle {
  private double radius;


  public Circle(double radiusIn) {
    radius = radiusIn;
  }

  public double getRadius() {
    return radius;
  }

  public double calculateDiameter() {
    return radius + radius;
  }

  public double calculateCircumference() {
    return 2 * Math.PI * radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}