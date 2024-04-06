package Mar26;

import java.util.Locale;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Thank you for choosing withdrawl.");
        System.out.println("How much would u like to withdrawl?");
        System.out.println("1=100");
        System.out.println("2=200");
        System.out.println("3=300");
        System.out.println("4=400");
        System.out.println("5=500");
        System.out.println("6=600");
        int withdrawlmoney = user.nextInt();

        switch (withdrawlmoney) {
            case 1:
                withdrawlmoney = 100;
                break;
            case 2:
                withdrawlmoney = 200;
                break;
            case 3:
                withdrawlmoney = 300;
                break;
            case 4:
                withdrawlmoney = 400;
                break;
            case 5:
                withdrawlmoney = 500;
                break;
//        default:
//           withdrawlmoney = "Invalid amount";
//            break;
        }
        System.out.println(withdrawlmoney);
        System.out.format("the value you want to withdrawal is: %d %n", withdrawlmoney);
        float floatVar = 4.5f;
        int intVar = 10;
        String stringVar = "Hello";
        System.out.format("The value of the float variable is %f while the value of the integer variable is %d%n and the string is %s", floatVar, intVar, stringVar);
        System.out.format(Locale.FRANCE, "The value of the float variable is %f while the value of the integer variable is %d%n and the string is %s", floatVar, intVar, stringVar);
    }
}
