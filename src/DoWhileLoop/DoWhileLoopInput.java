package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoopInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number to get the sum ");
        int number = scanner.nextInt();
        int sum = 0;
        int intialNumber = 1;
        do {
            System.out.println(intialNumber);
            sum += intialNumber;
            intialNumber++;
        }
        while (intialNumber <= number);
        System.out.println("Sum of these numbers are " + sum);
    }
}
