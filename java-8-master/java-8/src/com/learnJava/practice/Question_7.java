package com.learnJava.practice;

/*
Given numbers, check if any number in the stream is divisible by 5 using anyMatch
 */

import java.util.List;

public class Question_7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 2, 6, 7, 8, 9, 11, 11, 9, 8);

        Boolean result = numbers.stream()
                                .anyMatch(n -> n % 5 == 0);

        System.out.println(result);
    }
}
