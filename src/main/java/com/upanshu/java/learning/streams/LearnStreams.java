package com.upanshu.java.learning.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStreams {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<21; i++) {
            list.add(i);
        }

   //     list.forEach(System.out::println);

        List<Integer> a = list.stream().map(x -> x*2).collect(Collectors.toList());

//        for(Integer e : a) {
//            System.out.println(e);
//        }

        List<Integer> b = a.stream().filter(x -> (x%10 == 0)).collect(Collectors.toList());

        for(Integer e : b) {
            System.out.println("filtered" + e);
        }

        List<Integer> c = b.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sorted" + c);
    }

}
