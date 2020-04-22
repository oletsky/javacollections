package javatraining.oletsky.collections;

import java.util.ArrayList;

/**
 * A simple example of using forEach for collections
 */

public class ForEachForCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.forEach((x)-> System.out.print(x*x+" "));
    }
}
