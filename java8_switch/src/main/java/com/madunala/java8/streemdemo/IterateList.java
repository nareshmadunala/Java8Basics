package com.madunala.java8.streemdemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author nareshmadunala
 */

//iterator
public class IterateList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Naresh","Madunala","Kumar","Viv");
        names.stream().filter(name->name.equals("Kumar")).forEach(System.out::println);
    }
}
