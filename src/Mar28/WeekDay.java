package Mar28;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week ");
        String weekDay = scanner.next().toLowerCase();
        switch (weekDay) {
            case "monday ":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("This is a weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("This is a weekend");
                break;
            default:
                System.out.println("Please enter the correct weekday");
                break;

        }

    }
}
