package org.ps;
import java.util.*;

public class DecendingOrderUsingTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap with default natural ordering (ascending order)
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Add some entries to the map
        map.put(3, "apple");
        map.put(2, "banana");
        map.put(1, "orange");
        map.put(5, "grape");
        map.put(4, "pear");

        // Use a comparator to sort the entries in descending order
        Comparator<Integer> comparator = Collections.reverseOrder();
        TreeMap<Integer, String> descendingMap = new TreeMap<Integer, String>(comparator);
        descendingMap.putAll(map);

        // Print the entries in descending order
        for (Map.Entry<Integer, String> entry : descendingMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
