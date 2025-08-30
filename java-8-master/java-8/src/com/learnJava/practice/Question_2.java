package com.learnJava.practice;

import java.util.List;

import static java.util.stream.Collectors.toList;

/*
Given numbers, filter out all odd numbers and collect the remaining even numbers into a List<Integer>.
 */

public class Question_2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter( number -> number % 2 == 0)
                                           .collect(toList());

        System.out.println(evenNumbers);

    }
}
