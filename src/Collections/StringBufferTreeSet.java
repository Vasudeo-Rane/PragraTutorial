package Collections;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {
    public static void main(String[] args) {
        Set<StringBuffer> set = new TreeSet<>(new SBComparator());
        set.add(new StringBuffer("kbc"));
        set.add(new StringBuffer("efg"));
        set.add(new StringBuffer("mno"));

        for (StringBuffer obj : set) {
            System.out.println(obj);
        }

    }
}
