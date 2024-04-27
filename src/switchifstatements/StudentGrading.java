package switchifstatements;

import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        System.out.print("Input student's score :- ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble() || scanner.hasNextInt() || scanner.hasNextLong()) {
            double score = scanner.nextDouble();
            if (score >= 90 && score <= 100)
                System.out.println("Student Grade is A ");
            else if (score >= 80 && score <= 89)
                System.out.println("Student Grade is B ");
            else if (score >= 70 && score <= 79)
                System.out.println("Student Grade is C ");
            else if (score >= 60 && score <= 69)
                System.out.println("Student Grade is D ");
            else
                System.out.println("Student Grade is Failed");
        } else {
            System.out.println("Student Grade provided should be Integer, float or long");
        }
    }
}
