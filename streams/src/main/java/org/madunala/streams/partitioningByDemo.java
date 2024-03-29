package org.madunala.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author nareshmadunala
 */
public class partitioningByDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 2, 5, 7, 21, 89,34, 12, 6,1, 46, 73, 9);
        Map<Boolean, List<Integer> > listOfNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(number->number>35));

        System.out.println(listOfNumbers);
    }
}
