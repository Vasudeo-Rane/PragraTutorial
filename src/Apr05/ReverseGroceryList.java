package Apr05;


public class ReverseGroceryList {
    public static void reverseGroceries(String[] groceryList) {
        for (int i = 0; i < groceryList.length / 2; i++) {
            String tempGroceryList = groceryList[i]; //apple
            groceryList[i] = groceryList[(groceryList.length - (i + 1))];
            groceryList[(groceryList.length - (i + 1))] = tempGroceryList;
        }
    }


    public static void main(String[] args) {
        // Below is a sample test case you can use to run your code.
        // Try playing around with different values in the array to test edge cases
        String[] groceryList = {"apples", "banana", "xpples", "chocolate", "Mango"};
        reverseGroceries(groceryList);

        for (String item : groceryList) {
            System.out.println(item);
        }
    }
}

