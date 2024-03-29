package org.madunala.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author nareshmadunala
 */
public class StringListToMap {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Naresh", "Ravi", "Naresh", "Tom", "Naresh", "John", "Raju", "Ravi");

        Map<String, Long> namesFrequencyMap = names.stream().collect(Collectors.groupingBy(name->name, Collectors.counting() ));

        System.out.println(namesFrequencyMap);
    }
}
