package javatraining.oletsky.collections;

import java.util.LinkedList;

/**
 * LinkedList is also a Queue
 */
public class LinkedListAsAQueue {
    public static void main(String[] args) {
        LinkedList<Integer> coll = new LinkedList<>();
        coll.addFirst(10);
        coll.addFirst(20);
        coll.addLast(40);
        coll.addLast(50);
        System.out.println(coll); //20 10 40 50
        coll.remove();
        System.out.println(coll); //10 40 50
        }

}
