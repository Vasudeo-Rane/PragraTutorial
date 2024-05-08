package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(90);
        set.add(15);

        for (Integer set1 : set) {
            System.out.println(set1);
        }

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
