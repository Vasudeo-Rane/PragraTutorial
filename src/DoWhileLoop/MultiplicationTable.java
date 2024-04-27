package DoWhileLoop;
//write product table of a give number in specific format e.g. 5 * 1 = 5

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the table number ");
        int number = scanner.nextInt();
        int tempNumber = 1;
        while (tempNumber <= 10) {
            System.out.println(number + " * " + tempNumber + " = " + (number * tempNumber));
            tempNumber++;
        }
    }
}
