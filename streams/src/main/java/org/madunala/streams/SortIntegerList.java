package org.madunala.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author nareshmadunala
 */
public class SortIntegerList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 2, 5, 7, 21, 89,34, 12, 6, 1, 46, 73, 9);

        // Natural Sorting ascending
        numbers.stream().sorted().forEach(System.out::println);

        // Natural Sorting descending
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);



    }
}
