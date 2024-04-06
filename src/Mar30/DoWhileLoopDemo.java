package Mar30;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        do {
            System.out.println(number);
            sum += number;
            number++;
        }
        while (number <= 10);
        System.out.println("Sum of these numbers are " + sum);
    }
}
