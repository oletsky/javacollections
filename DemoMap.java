package javatraining.oletsky.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author O.Oletsky
 * Demonstrating main features of HashMap
 */
public class DemoMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("cake", 10);
        hm.put("water", 100);
        hm.put("bread", 200);
        System.out.println(hm.get("beer")); //null
        System.out.println(hm.get("water")); //100
        hm.put("water", 50);
        System.out.println(hm.get("water")); //50
        // Two ways of how to output a map
        System.out.println(hm);
        for (var m : hm.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }

    }

}
