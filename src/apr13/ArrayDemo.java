package apr13;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {25, 44, 23, 52, 54, 23, 87, 87};
        int sum = 0;
        for (int arrays : arr) {
            sum += arrays;
        }
        System.out.println("sum of all the number is " + sum);
    }
}
