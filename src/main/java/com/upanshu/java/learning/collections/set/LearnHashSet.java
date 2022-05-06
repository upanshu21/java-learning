package com.upanshu.java.learning.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {

    public static void main(String[] args) {

     //   Set<Integer> set = new HashSet<>();   //// BigO(1)
     //   Set<Integer> set = new LinkedHashSet<>(); ////BigO(1)
        Set<Integer> set = new TreeSet<>();  // BigO(log n)
        set.add(3);
        set.add(4);
        set.add(6);
        set.add(7);
        set.add(7);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(5);
        System.out.println(set);
        System.out.println(set.remove(4));
        System.out.println(set);

    }
}
