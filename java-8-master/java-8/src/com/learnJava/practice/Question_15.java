package com.learnJava.practice;
/*
Given words, find any word that contains the letter 'e' using findAny. Print the Optional<String>.
 */

import java.util.List;
import java.util.Optional;

public class Question_15 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        Optional<String> optionalString = words.stream() // Stream<String>
                                               .filter(letter -> letter.contains("e"))
                                               .findAny();
        System.out.println(optionalString.get());
    }
}
