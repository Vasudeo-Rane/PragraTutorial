package Apr02;

public class Rectangle {

    public double area(double length, double breadth) {
        return length * breadth;
    }

    public double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of rectangle is " + rectangle.area(3, 4));
        System.out.println("Perimeter of rectangle is " + rectangle.perimeter(3, 4));

    }
}