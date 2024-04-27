package DoWhileLoop;
//Implement a program to find the factorial of a given number using a while loop.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number for which you want to do factorial ");
        int number = scanner.nextInt();
        int tempNumber = 1;
        while (number > 1) {     //3<=1
            tempNumber = tempNumber * number;  //3
            number--;    //number = 2
        }
        System.out.println("Factorial of the number  is " + tempNumber);
    }
}
