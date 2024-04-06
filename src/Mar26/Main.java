package Mar26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char ch;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the next character");
            ch = scanner.next().charAt(0);
        } while (ch != 'q' || ch != 'Q'); // this will always be true due to || condition.

        System.out.println("Hello world!");
    }
}