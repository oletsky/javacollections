package javatraining.oletsky.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * author O.Oletsky
 * Exploring the time needed for changing the middle element
 * in a large list (ArrayList or LinkedList)
 * Think of what would change if we tried to remove the element
 * close to the beginning or to the end
 * and then check it
 */

public class SpeedArrayAndLinkedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i<100000L;i++) {
            list.add("aaaaa");
        }
        long beginMark = System.nanoTime();
        list.set(50000,"zzzz");
        long endMark = System.nanoTime();
        double elapsedTime = (endMark - beginMark)/1000.;
        System.out.printf("Elapsed time is%9.2f mks\n", elapsedTime);

    }
}
