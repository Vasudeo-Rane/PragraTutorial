package Apr06;

public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width) {
        this.width = width;
        this.length = 0.00;
    }

    public void area() {
        double totalArea = length * width;
        System.out.println("Area of rectangle " + totalArea);
    }

    public void perimeter() {
        double totalPerimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle " + totalPerimeter);
    }
}
