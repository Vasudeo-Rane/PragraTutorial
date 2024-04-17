package arrayAssignment;

public class arrayManipulation {
    public static void main(String[] args) {
        //   Reverse the array
        int[] number = {10, 30, 43, 54, 23, 543, 43, 32};
        int arrayLength = number.length;
        //   Reverse the array
        for (int i = 0; i < arrayLength / 2; i++) {
            int temp = number[i];
            number[i] = number[number.length - i - 1];
            number[number.length - i - 1] = temp;
        }
        for (int elements : number) {
            System.out.print(elements + " ");
        }

//    find the minimum element
        int min = number[0];
        for (int i = 1; i < arrayLength; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println();
        System.out.println("min " + min);

//   find the second maximum

        int max = number[0];
        for (int i = 1; i < arrayLength; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println();
        System.out.println("max " + max);

        int secondMax = number[0];
        for (int i = 1; i < arrayLength; i++) {
            if (secondMax < number[i] && number[i] != max) {
                secondMax = number[i];
            }
        }
        System.out.println();
        System.out.println("secondMax " + secondMax);

        //   find the second minimum

        int secondMin = number[0];
        for (int i = 1; i < arrayLength; i++) {
            if (secondMin > number[i] && number[i] != min) {
                secondMin = number[i];
            }
        }
        System.out.println();
        System.out.println("secondMin " + secondMin);

        //   find the sum of all the elements in array
        int sum = 0;
        for (int elements : number) {
            sum += elements;
        }
        System.out.println("sum of all the elements in array " + sum);

//     find average of all the elements in array
        double average = sum / arrayLength;
        System.out.println("Average of all the elements in array " + average);

//    sort the given array
/*        int[] number2 = Arrays.stream(number).sorted().toArray();
        for (int elements : number2) {
            System.out.print(elements + " ");
        }*/


        //  Another way of sorting the array
        for (int j = 0; j < arrayLength - 1; j++) {
            for (int i = 0; i < arrayLength - 1; i++) {
                if (number[i] > number[i + 1]) {
                    int temp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = temp;
                }
            }
        }
        System.out.print(" Sorted Array ");
        for (int elements : number) {
            System.out.print(elements + " ");
        }

//    add two 3x3 arrays
        int[][] array1 = {{54, 12, 4}, {2, 36, 40}, {6, 4, 5}};
        int[][] array2 = {{2, 9, 40}, {5, 3, 6}, {3, 5, 12}};
        int[][] array3 = new int[3][3];

        int[][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

//   create a char array characters A , B , C , D*/
        char[] charArray = {'A', 'B', 'C', 'D'};

    }
}