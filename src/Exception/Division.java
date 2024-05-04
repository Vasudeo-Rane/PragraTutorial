package Exception;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        System.out.println("enter the first number ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        String argumentPassed = args[0];
        // String argumentPassed1 = args[1];
        System.out.println(argumentPassed);
        // System.out.println(argumentPassed1);
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Do not enter 0 ");
            System.out.println("enter the second number except 0 ");
            int i = scanner.nextInt();
            c = a / i;
        }

        System.out.println("Result " + c);


    }
}
