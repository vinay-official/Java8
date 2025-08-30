package com.learnJava.practice;
/*
Given words, create a stream, filter words that start with the letter 'c', and count how many there are.
 */

import java.util.List;

public class Question_14 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "canana", "cherry", "cate", "elderberry");

        Long result = words.stream()
                           .filter(letter -> letter.startsWith("c"))
                           .count();

        System.out.println(result);
    }
}
