package com.upanshu.java.learning.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {
        List<String> arrayList = new LinkedList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
