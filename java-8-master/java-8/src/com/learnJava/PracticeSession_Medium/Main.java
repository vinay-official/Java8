package com.learnJava.PracticeSession_Medium;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PracticeSession q2 = new PracticeSession();
        Optional<Integer> ans= q2.q42_FindFirstUniqueNumber();
        System.out.println(ans.get());
    }
}
