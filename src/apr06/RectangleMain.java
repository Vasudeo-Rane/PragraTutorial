package apr06;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.area();
        rectangle.perimeter();

        Rectangle rectangle1 = new Rectangle(5);
        rectangle1.area();
        rectangle1.perimeter();
    }
}
