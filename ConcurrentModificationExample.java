package javatraining.oletsky.collections;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * An example of ConcurrentMpdificationException
 */
public class ConcurrentModificationExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        int i=0;
        for (var elem: list) {
            if (++i == 2) list.remove(4);
        }
        System.out.println(list);

    }
}
