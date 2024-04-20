package apr13;

public class NumberUtils {
    public static void main(String[] args) {
        int number = 4321;
        int num = 0;
        if (number > 0) {
            while (number > 0) {
                num = num * 10;     //40 //430  // 4321
                num = num + (number % 10);  //4  //43 // 4321
                number = number / 10;  //123  //23  //3


            }
        }
        System.out.println(num);
    }
}
