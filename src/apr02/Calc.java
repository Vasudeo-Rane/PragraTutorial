package apr02;

import java.util.Scanner;

public class Calc {
    private static Object userInput;

    public static void main(String[] args) {
        String userInput;
        do {
            System.out.println("Welcome to my calculator ");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for multiplication ");
            System.out.println("Press 3 for substraction");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 for modulus");
            System.out.println("Press 0 for exit");
            System.out.println("Enter your choice : ");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();

            if ((operation > 0) && (operation < 6)) {

                System.out.println("Please enter your first number ");
                int x = scanner.nextInt();

                System.out.println("Please enter your second number ");
                int y = scanner.nextInt();

                float result;
                switch (operation) {

                    case 1:
                        result = (x + y);
                        System.out.println("Addition of the two number is " + result);
                        break;
                    case 2:
                        result = (x * y);
                        System.out.println("Multiplication of the two number is " + result);
                        break;
                    case 3:
                        result = (x - y);
                        System.out.println("Substraction of the two number is " + result);
                        break;
                    case 4:
                        int result1 = x / y;
                        result = result1;
                        System.out.println("Division of the two number is " + result);
                        break;
                    case 5:
                        result = (x % y);
                        System.out.println("Modulus of the two number is " + result);
                        break;
                }
            } else {
                System.out.println("wrong operation ");
            }
            System.out.println("Do you still want to continue enter Yes/No ");
            userInput = scanner.next();
            System.out.println(userInput);
        } while (userInput.equalsIgnoreCase("Yes"));

    }

}

