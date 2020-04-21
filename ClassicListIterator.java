package javatraining.oletsky.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author O.Oletsky
 * Canonical loop by a list using iterator
 */

public class ClassicListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }

}
