package apr13;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {20, 10, 50, 30, 70, 73, 5};

        int i = 0;
        int j = 1;
        for (int n = 1; n < arr.length; n++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i = i + 1;
            j = j + 1;
        }
        for (int array : arr) {
            System.out.println(array);
        }
    }
}
