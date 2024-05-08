package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(10);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(1);

        System.out.println(list1.contains(5));
        //list1.add(6, 23);
        //list1.remove(2);
        //list1.clear();
        /*list1.remove(2);
        System.out.println(list1.size());
        System.out.println(list1.lastIndexOf(1));
*/

        boolean add = list1.add(9);
        System.out.println(add);
        System.out.println(list1.get(4));
        System.out.println(list1);

    }
}
