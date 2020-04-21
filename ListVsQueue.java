package javatraining.oletsky.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author O.Oletsky
 * LinkedList as List and Queue
 * How the method remove() works
 */

public class ListVsQueue {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list); // 10 20 30 40 50 60
        //list.remove(); No such a method in List
        Queue<Integer> queue = (Queue<Integer>) list;
        queue.remove(); //Attention: method of Queue!
        System.out.println(queue); //20 30 40 50 60
        System.out.println(list); //20 30 40 50 60
    }
}
