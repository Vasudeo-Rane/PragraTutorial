package assignment4;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        double areaOfSquare = shape.area(4);
        System.out.println(areaOfSquare);

        Shape shape1 = new Shape();
        double areaOfCircle = shape1.area(5.00);
        System.out.println(areaOfCircle);

        Shape shape2 = new Shape();
        double areaOfRectangle = shape2.area(3, 4);
        System.out.println(areaOfRectangle);
    }
}
