package com.learnJava.practice.Pactice_session_Easy;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PracticeSession practiceSession = new PracticeSession();
        Optional<String> evenNumbers = practiceSession.q15_findAny();
        System.out.println(evenNumbers.get());
    }
}
