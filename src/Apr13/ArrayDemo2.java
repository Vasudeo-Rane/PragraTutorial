package Apr13;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};  //length = 7
        int j = 0;
        for (int i = arr.length; i > arr.length / 2; i--) {
            int temp = arr[arr.length - j - 1];   //7
            arr[arr.length - j - 1] = arr[j];
            arr[j] = temp;
            j = j + 1;
        }

        for (int array : arr) {
            System.out.println(array);
        }
    }
}
