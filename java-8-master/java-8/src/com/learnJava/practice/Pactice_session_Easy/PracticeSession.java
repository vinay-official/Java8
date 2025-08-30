package com.learnJava.practice.Pactice_session_Easy;

import javax.swing.plaf.PanelUI;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PracticeSession {

    // 1. Given numbers, create a stream and print each number to the console using forEach.

    public void q1_printNumbers() {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
         numbers.stream()
                 .forEach(n -> System.out.print(n + " "));
    }

    // 2. Given numbers, filter out all odd numbers and collect the remaining even numbers into a List<Integer>.

    public List<Integer> q2_findEven() {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8};
          return Arrays.stream(arr)
                  .filter(n -> n % 2 == 0)
                  .mapToObj(Integer::valueOf)
                  .collect(toList());
    }

    // 3. Given numbers, create a stream, square each number (n*n), and collect the results into a List<Integer>.

    public List<Integer> q3_Square() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // 4. Given numbers, count the total number of elements in the stream.

    public Long q4_countNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        return numbers.stream()
                .count();
    }

    // 5. Given numbers, find the largest number in the stream using max. Print the Optional<Integer> result.

    public Optional<Integer> q5_findMax() {
        List<Integer> numbers = List.of(20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 9, 8);
        return numbers.stream()
                .max(Comparator.comparing(n -> n));
    }

    // 6. Given numbers, find the smallest number in the stream using min. Get the integer value, assuming the list is not empty.

    public Optional<Integer> q6_findMin() {
        List<Integer> numbers = List.of(20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 9, 8);
        return numbers.stream()
                .min(Comparator.comparing(n -> n));
    }

    // 7. Given numbers, check if any number in the stream is divisible by 5 using anyMatch.

    public Boolean q7_divisibleByFive() {
        List<Integer> numbers = List.of(20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 9, 8);
        return numbers.stream()
                .anyMatch(n -> n % 5 == 0);
    }

    // 8. Given numbers, check if all numbers in the stream are positive (> 0) using allMatch.

    public Boolean q8_numberGreaterThanZero() {
        int arr[] = new int[] {1, 2, 3, 4, 5, -6, 7, 8, 9, 10, 10, 9, 8};

        return Arrays.stream(arr)
                .allMatch(n -> n > 0);

    }

    // 9. Given numbers, find the first number greater than 5 using filter and findFirst. Print the Optional<Integer>.

    public Optional<Integer> q9_findFirst() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 6, 7, 8, 9, 10, 15, 9, 8);
        return numbers.stream()
                .filter(n -> n > 5)
                .findFirst();
    }

    // 10. Given numbers, create a stream, skip the first 4 elements, and collect the rest into a List<Integer>.

    public List<Integer> q10_Skip() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        return numbers.stream()
                .skip(4)
                .collect(Collectors.toList());
    }

    // 11. Given numbers, create a stream, limit it to the first 3 elements, and collect them into a List<Integer>.

    public List<Integer> q11_Limit() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        return numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
    }

    // 12. Given numbers, create a stream, find the unique numbers, and collect them into a Set<Integer>.

    public List<Integer> q12_uniqueNumber() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // 13. Given words, create a stream, convert each word to its length, and collect the lengths into a List<Integer>.

    public LinkedHashMap<String, Integer> q13_countLength() {
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        return words.stream()
                .collect(Collectors.toMap(n -> n, n -> n.length(), (v1, v2) -> v1, LinkedHashMap::new));
    }

    // 14. Given words, create a stream, filter words that start with the letter 'c', and count how many there are.

    public Long q14_startWithCount() {
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        return words.stream()
                .filter(word -> word.startsWith("c"))
                .count();
    }

    // 15. Given words, find any word that contains the letter 'e' using findAny. Print the Optional<String>.

    public Optional<String> q15_findAny() {
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        return words.stream()
                .filter(word -> word.contains("e"))
                .findAny();

    }




}
