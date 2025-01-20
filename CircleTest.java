
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius : " + radius);
      
    }
}

public class CircleTest {
    public static void main(String[] args) {
       Circle circle = new Circle(10.0);
            circle.displayDetails();
            System.out.println("Area of circle is " + circle.getArea() + " sq. units");
            circle.setRadius(20.0);
            circle.displayDetails();
            System.out.println("Area of circle is " + circle.getArea() + " sq. units");
    }
}