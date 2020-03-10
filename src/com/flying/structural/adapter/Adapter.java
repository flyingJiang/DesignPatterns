package com.flying.structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Plug adapter
 * Convert interface into another interface
 * Legacy
 * Translates requests
 * Client Adapter Adaptee
 * Examples: Arrays Lists
 */
public class Adapter {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1,2,3};
        List<Integer> list = Arrays.asList(ints);
        System.out.println(ints);
        System.out.println(list);
    }
}
