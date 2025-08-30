package com.learnJava.practice;
/*
Given numbers, check if all numbers in the stream are positive (> 0) using allMatch.
 */

import java.util.List;

public class Question_8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, -1, 8);

        Boolean result = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println(result);
    }
}
