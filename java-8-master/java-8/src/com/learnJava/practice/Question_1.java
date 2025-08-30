package com.learnJava.practice;

import java.util.List;

/*
Given numbers, create a stream and print each number to the console using forEach.
 */

public class Question_1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

        numbers.stream()
                .forEach(number -> System.out.print(number + " "));
    }

}
