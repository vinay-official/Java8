package com.learnJava.practice;

/*
Given numbers, create a stream, limit it to the first 3 elements, and collect them into a List<Integer>.
 */

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Question_11 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        List<Integer> result = numbers.stream()
                                      .limit(3)
                                      .collect(toList());

        System.out.println(result);
    }
}
