package org.madunala.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author nareshmadunala
 */
public class FilterIntegerArray {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(21, 34, 18, 14, 56);

        numbers.stream().filter(number->number>30).forEach(System.out::println);
    }
}
