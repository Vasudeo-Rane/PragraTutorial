package Collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        List<Integer> list = Arrays.asList(0, 304, 50, 203, 503, 23, 30, 50, 203, 503, 22, 10);

        Set<Integer> set = new HashSet<>(list);
        // Print all the unique values from the list
        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();
        for (Integer element : list) {
            if (!set1.add(element)) {
                duplicateList.add(element);
            }
        }
        //Print all the duplicates
        System.out.println(duplicateList);

    }
}
