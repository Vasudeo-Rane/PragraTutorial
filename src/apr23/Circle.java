package apr23;

public class Circle extends Shape {

    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Area of Circle is " + PI * radius * radius);

    }
}