package com.learnJava.practice;

/*
Create a stream from the array String[] letters = {"X", "Y", "Z", "A"}; and collect it into a sorted list.
 */

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Question_26 {
    public static void main(String[] args) {
        String[] letters = {"X", "Y", "Z", "A"};
        List<String> sorted = Arrays.stream(letters)
                                    .sorted()
                                    .collect(toList());
        System.out.println(sorted);
    }
}
