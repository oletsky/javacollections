package javatraining.oletsky.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author O.Oletsky
 * Main operations with ArrayList
 */
public class DemoArrayList {
    public static void main(String[] args) {
        //Creating list
        ArrayList<Integer> list = new ArrayList<>();
        //Filling list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list); // 10 20 30 40 50
        //Or typical iterating
        for (var l:list) {
            System.out.print(l+" ");
        }
        System.out.println(" ");
        //Getting number of elements
        System.out.println("Size of list is "+list.size()); //5
        //Getting element by index
        System.out.println(list.get(1)); //20
        //Putting element into middle of list
        list.add(1,100);
        System.out.println(list); //10 20 100 30 40 50
        //Finding an element
        int index = list.indexOf(100);
        System.out.println("Index of 100 is "+index); //1
        //Removing element by index
        list.remove(1);
        System.out.println(list); //10 20 30 40 50
        //Removing element by value
        // list.remove(30); This is wrong!
        list.remove((Integer) 30); //Correct
        System.out.println(list); //10 20 40 50
        //Some methods of class Collections
        Collections.reverse(list);
        System.out.println("Reversed list: "+list); //50 40 20 10
        Collections.shuffle(list);
        System.out.println("Shuffled list: "+list);
        Collections.sort(list);
        System.out.println("Sorted list: "+list); //10 20 30 40
    }
}
