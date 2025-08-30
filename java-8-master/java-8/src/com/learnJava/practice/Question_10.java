package com.learnJava.practice;

/*
Given numbers, create a stream, skip the first 4 elements, and collect the rest into a List<Integer>.
 */

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Question_10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

        List<Integer> result = numbers.stream()
                                      .skip(4)
                                      .collect(toList());

        System.out.println(result);
    }
}
