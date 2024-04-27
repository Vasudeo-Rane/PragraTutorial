package DoWhileLoop;
//write java program to find the sum of first n natural numbers

import java.util.Scanner;

public class DoLoopWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to which you want the sum");
        int number = scanner.nextInt();
        int sum = 0;
        int intialNumber = 1;
        while (intialNumber <= number) {
            System.out.println(intialNumber);
            sum += intialNumber;
            intialNumber++;
        }
        System.out.println("Sum of these numbers are " + sum);
    }
}
