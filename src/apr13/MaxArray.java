package apr13;

public class MaxArray {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {20, 10, 50, 30, 15, 70, 73, 5};

        for (int j : arr) {
            if (max < j)
                max = j;
        }

        System.out.println(max);
    }
}
