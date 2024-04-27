package apr23;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        System.out.println("area of rectangle is " + (length * breadth));
    }

}