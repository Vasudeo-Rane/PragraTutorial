package Mar30;

//write java program to find the sum of first 10 natural numbers
public class DoLoopDemo {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (number <= 100) {
            System.out.println(number);
            sum += number;
            number++;
        }
        System.out.println("Sum of these numbers are " + sum);
    }
}
