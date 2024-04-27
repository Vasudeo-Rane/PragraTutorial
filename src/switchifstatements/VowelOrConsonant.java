package switchifstatements;

//Create a program that takes a character as input and determines if it's a vowel or a consonant.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Enter the character :- ");
        Scanner scanner = new Scanner(System.in);
        String character = scanner.next();
        if ((character.charAt(0) == 'a') || (character.charAt(0) == 'e') || (character.charAt(0) == 'i') ||
                (character.charAt(0) == 'o') || (character.charAt(0) == 'u') || (character.charAt(0) == 'A') ||
                (character.charAt(0) == 'E') || (character.charAt(0) == 'I') ||
                (character.charAt(0) == 'O') || (character.charAt(0) == 'U'))
            System.out.println("The character entered " + character.charAt(0) + " is Vowel");
        else
            System.out.println("The character entered " + character.charAt(0) + " is Consonant");
    }
}
