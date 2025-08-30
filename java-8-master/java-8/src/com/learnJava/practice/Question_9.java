package com.learnJava.practice;
/*
Given numbers, find the first number greater than 5 using filter and findFirst. Print the Optional<Integer>.
 */

import java.util.List;
import java.util.Optional;

public class Question_9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 2, 8, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

        Optional<Integer> result = numbers.stream()
                                          .filter(n -> n > 5)
                                          .findFirst();

        System.out.println(result.get());
    }
}
