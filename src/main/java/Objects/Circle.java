package Objects;

public class Circle {
      public double PI = 3.14;
      public double radius;
      public double calculateArea(double radius) {
          this.radius = PI * Math.pow(2,radius);
          return this.radius;
    }

    public Circle(double radius) {
        this.radius = calculateArea(radius);
    }
}
