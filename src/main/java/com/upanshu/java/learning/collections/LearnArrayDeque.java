package com.upanshu.java.learning.collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> dec = new ArrayDeque<>();
        dec.offer(1);
        dec.offerLast(4);
        dec.offerFirst(11);
        dec.offerLast(13);
        dec.offer(5);

        System.out.println(dec);
        System.out.println(dec.peekFirst());
        System.out.println(dec.peekLast());

    }
}
