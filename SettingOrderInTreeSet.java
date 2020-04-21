package javatraining.oletsky.collections;

import java.util.TreeSet;

/**
 * @author O.Oletsky
 * An order in a TreeSet can be specified by a comparator
 */

public class SettingOrderInTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts =
                new TreeSet<String>(
                        (s1,s2)->s1.length()-s2.length()

                );
        ts.add("tiny");
        ts.add("small");
        ts.add("bigger");
        ts.add("significant");
        ts.add("extremely large");
        ts.add("this string is almost a blob");

        for (var s:ts) {
            System.out.println(s);
        }

    }
}
