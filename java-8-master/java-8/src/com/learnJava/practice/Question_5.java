package com.learnJava.practice;
/*
Given numbers, find the largest number in the stream using max. Print the Optional<Integer> result.
 */

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Question_5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 9, 8);

        // 1st way by converting stream<Integer> into IntStream
        /*
        OptionalInt result = numbers.stream()
                                  .mapToInt(n -> n)
                                  .max();

         */
        // 2nd way using Comparator interface
        Optional<Integer> result = numbers.stream()
                                          .max(Comparator.comparing(n -> n));

        System.out.println(result.get());

    }
}
