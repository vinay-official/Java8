package com.learnJava.practice;

/*
Given numbers, count the total number of elements in the stream.
 */

import java.util.List;

public class Question_4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        Long totalNumber = numbers.stream() // Stream<numbers>
                                  .count(); // it traverses the stream one by one and just count the value

        System.out.println(totalNumber);
    }
}
