package javatraining.oletsky.collections;

import java.util.TreeSet;

/**
 * @author O.Oletsky
 * If you are sure that a TreeSet can't contain duplicate values
 * you are wrong
 * This example shows how this can be done
 * by means of a certain comparator
 * It always shows which results an improper definitions of compare
 * can lead to
 */

public class DublicatesInTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(
                (i1,i2)->1
        );
        ts.add(10);
        ts.add(10);
        System.out.println(ts); //10 10
    }
}
