package apr02;

public class Circle {

    public double area(double radius) {
        return (3.14 * radius * radius);
    }

    public double perimeter(double radius) {
        return (2 * 3.14 * radius);
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of circle is " + circle.area(3));
        System.out.println("Perimeter of circle is " + circle.perimeter(3));

    }
}