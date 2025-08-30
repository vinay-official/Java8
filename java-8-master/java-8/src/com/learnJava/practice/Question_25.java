package com.learnJava.practice;
/*
Create an IntStream representing numbers from 5 to 15 (inclusive) and calculate their sum.
 */

import java.util.stream.IntStream;

public class Question_25 {
    public static void main(String[] args) {
        Integer sum = IntStream.rangeClosed(5, 15)
                               .sum();

        System.out.println(sum);
    }
}
