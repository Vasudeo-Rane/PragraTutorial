package assignment4;

public class Shape {
    public int area(int side) {
        int calculatedArea = side * side;
        return calculatedArea;
    }

    public double area(double radius) {
        double calculatedArea = 3.14 * radius * radius;
        return calculatedArea;
    }

    public double area(int length, int width) {
        double calculatedArea = length * width;
        return calculatedArea;
    }

}
