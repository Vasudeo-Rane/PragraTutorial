package apr05;

public class GroceryList {
    public static boolean hasDuplicates(String[] groceryList) {
        for (int i = 0; i < groceryList.length; i++)
            for (int j = i + 1; j < groceryList.length; j++) {
                if (groceryList[i].equals(groceryList[j]))
                    return true;

            }
        return false;
    }


    public static void main(String[] args) {
        // Below is a sample test case you can use to run your code.
        // Try playing around with different values in the array to test edge cases
        String[] groceryList = {"apples", "banana", "xpples", "chocolate"};
        System.out.println(hasDuplicates(groceryList));

    }
}
