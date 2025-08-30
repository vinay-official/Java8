package com.learnJava.practice;
/*
Given numbers, calculate the sum of all numbers using mapToInt followed by sum.
 */

import java.util.List;

public class Question_27 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        Long sum = numbers.stream()
                          .mapToLong(n -> n)
                          .sum();

        System.out.println(sum);
    }
}
