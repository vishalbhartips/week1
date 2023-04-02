package org.ps;

import java.util.*;

class TreeMapSortByValue {
    // Method for sorting the TreeMap based on values
    public static <Integer, String extends Comparable<String> > Map<Integer, String> valueSort(final Map<Integer, String> map) {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<Integer> valueComparator = new Comparator<>() {
            @Override
            public int compare(Integer k1, Integer k2) {
                return map.get(k2).compareTo(map.get(k1));
            }
        };
        // SortedMap created using the comparator
        Map<Integer, String> sorted = new TreeMap<>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }

    public static void main(String[] args) {

        Map<Integer, String> treeMap
                = new TreeMap<>();

        treeMap.put(3, "apple");
        treeMap.put(2, "banana");
        treeMap.put(1, "orange");
        treeMap.put(5, "grape");
        treeMap.put(4, "pear");

        // Calling the method valueSort
        Map<Integer, String> sortedMap = valueSort(treeMap);
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

