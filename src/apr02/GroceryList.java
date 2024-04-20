package apr02;

public class GroceryList {
    public static boolean hasSpecialItem(double[] groceryPrices) {
        for (double itemCost : groceryPrices) {
            String itemCostStr = String.valueOf(itemCost);
            System.out.println(itemCostStr.length());
            System.out.println(itemCostStr.length() - 2);

            if (itemCostStr.length() > 1 && itemCostStr.substring(itemCostStr.length() - 2, itemCostStr.length()).equals("99")) {
                return true;
                //commented
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Below is a sample test case you can use to run your code.
        // Try playing around with different values in the array to test edge cases
        double[] groceryList = {10.0, 89.9, 8.99, 2.34};
        System.out.println(hasSpecialItem(groceryList));
        System.out.println(groceryList);

    }
}
