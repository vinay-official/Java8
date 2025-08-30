package com.learnJava.practice;
/*
Given words, create a stream, convert each word to its length, and collect the lengths into a List<Integer>.
 */

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Question_13 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");

        List<Integer> result = words.stream()
                                    .map(n -> n.length())
                                    .collect(toList());

        System.out.println(result);
    }
}
