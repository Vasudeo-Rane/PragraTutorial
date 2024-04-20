package mar30;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number between 1 and 100 , you got 3 changes to win ");
        int luckynumber = 55;
        int j = 3;
        //after 3 try - try your luck again
        for (int i = 1; i <= j; i++) {
            int number = scanner.nextInt();
            if (number == luckynumber) {
                System.out.println("You won $50000");
                break;
            } else if (i < j) {
                System.out.print("Sorry , Try again, You have " + (j - i) + " more chances ");
            } else
                continue;
        }
        System.out.println("Hard luck try again next time ");
    }
}
