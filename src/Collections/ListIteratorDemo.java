package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("ebvfgbdx");
        list.add("isfgsdfij");
        list.add("klczcm");

/*
        for (String element : list) {
            list.remove(new String(element));
        }
*/

        System.out.println(list);

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            if (itr.next().equals("klczcm")) {
                itr.remove();
            }
        }
        System.out.println(list);

        ListIterator<String> itr1 = list.listIterator();
        System.out.println(itr1.hasPrevious());

    }

}

