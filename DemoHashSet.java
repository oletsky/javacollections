package javatraining.oletsky.collections;

import java.util.HashSet;

/**
 * Demonstration of HashSet
 */

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs); //Order may differ


    }
}
