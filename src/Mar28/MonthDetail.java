package Mar28;

import java.util.Scanner;

public class MonthDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numeric month in number ");
        int numericMonth = scanner.nextInt();
        switch (numericMonth) {
            case 1:
                System.out.println("This month is January");
                break;
            case 2:
                System.out.println("This month is February");
                break;
            case 3:
                System.out.println("This month is March");
                break;
            case 4:
                System.out.println("This month is April");
                break;
            case 5:
                System.out.println("This month is May");
                break;
            case 6:
                System.out.println("This month is June");
                break;
            case 7:
                System.out.println("This month is July");
                break;
            case 8:
                System.out.println("This month is August");
                break;
            case 9:
                System.out.println("This month is September");
                break;
            case 10:
                System.out.println("This month is October");
                break;
            case 11:
                System.out.println("This month is November");
                break;
            case 12:
                System.out.println("This month is December");
                break;

        }

    }
}
