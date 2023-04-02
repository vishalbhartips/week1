package org.ps;

import java.util.*;

public class TreeMapCustomComparator {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap(new CustomComparator());

        // Add some entries to the map
        treeMap.put(3, "apple");
        treeMap.put(2, "banana");
        treeMap.put(1, "orange");
        treeMap.put(5, "grape");
        treeMap.put(4, "pear");

        // Print the entries in descending order
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
