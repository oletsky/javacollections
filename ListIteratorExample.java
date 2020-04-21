package javatraining.oletsky.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author O.Oletsky
 * Lists can be iterated both in a forward and in a reverse order
 */

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> coll = new ArrayList<>();
        coll.add(10);
        coll.add(20);
        coll.add(30);
        coll.add(40);
        coll.add(50);
        System.out.println("Reverse order:");
        ListIterator<Integer> li = coll.listIterator(coll.size());
        while (li.hasPrevious()) {
            System.out.print(li.previous()+" ");
        }
        System.out.println();

    }
}
