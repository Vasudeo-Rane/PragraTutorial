package mar28;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle for which you want the area ");
        float radius = scanner.nextFloat();
        System.out.println("Area of the circle is " + (3.14 * radius * radius));
        double AreaOfCircle = (3.14 * Math.pow(radius, 2));
        System.out.println("Area of the circle is " + AreaOfCircle);


    }
}
