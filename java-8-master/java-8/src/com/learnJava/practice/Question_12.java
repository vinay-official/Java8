package com.learnJava.practice;
/*
Given numbers, create a stream, find the unique numbers, and collect them into a Set<Integer>.
 */

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Question_12 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

        Set<Integer> result = numbers.stream()
                                     .collect(toSet());

        System.out.println(result);
    }
}
