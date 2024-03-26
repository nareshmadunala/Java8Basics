package com.madunala.java8.streemdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author nareshmadunala
 */
public class SortAnArrayWithStreem {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 9, 1, 3, 15, 6, 88, 45, 0);
        numbers.stream().sorted().forEach(System.out::println);
        // reverse sort
        System.out.println(" descending order ");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
