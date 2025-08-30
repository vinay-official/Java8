package com.learnJava.practice;

/*
Given numbers, create a stream, square each number (n*n), and collect the results into a List<Integer>.
 */

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Question_3 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

        List<Integer> squareNumber = numbers.stream()
                                            .map(n -> n * n)
                                            .collect(toList());

        System.out.println(squareNumber);
    }
}
