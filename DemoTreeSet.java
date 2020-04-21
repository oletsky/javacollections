package javatraining.oletsky.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author O.Oletsky
 * Demonstrating main features of TreeSet
 */

public class DemoTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(5);
        ts.add(50);
        ts.add(10);
        ts.add(7);
        ts.add(5);
        System.out.println(ts); //5 7 10 50
        // Collections.sort(ts); Cannot be applied
        //Collections.reverse(ts); Cannot be applied

    }
}
