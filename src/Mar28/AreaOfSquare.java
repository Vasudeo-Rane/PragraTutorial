package Mar28;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the square for which you want the area ");
        float length = scanner.nextFloat();
        System.out.println("Area of the square is " + (length * length));
        double AreaOfCircle = Math.pow(length, 2);
        System.out.println("Area of the square is " + AreaOfCircle);


    }
}
