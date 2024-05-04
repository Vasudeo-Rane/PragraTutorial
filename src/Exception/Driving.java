package Exception;


import java.util.Scanner;

public class Driving {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18 && age <= 100) {
            System.out.println("eligible to take the driving test");
        } else {
            throw new InvalidAgeException("Age should be greater than 18 and less than 100");
        }
    }
}
