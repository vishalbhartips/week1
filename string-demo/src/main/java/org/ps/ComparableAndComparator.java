package org.ps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator implements Comparable<ComparableAndComparator> {
    String name;

    public ComparableAndComparator() {
    }

    public ComparableAndComparator(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparableAndComparator o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        List<ComparableAndComparator> list = new ArrayList<>();
        list.add(new ComparableAndComparator("abc"));
        list.add(new ComparableAndComparator("bcd"));
        Collections.sort(list);
        for( ComparableAndComparator x : list) System.out.println(x.name);

//        Collections.sort(list, new DecreaseComp());
        list.sort(new DecreaseComp());
        for( ComparableAndComparator x : list) System.out.println(x.name);
    }
}

 class DecreaseComp implements Comparator<ComparableAndComparator> { //decreasing

     @Override
     public int compare(ComparableAndComparator o1, ComparableAndComparator o2) {
         return o2.name.compareTo(o1.name);
     }
 }
