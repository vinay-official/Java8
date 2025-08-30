package com.learnJava.practice;

/*
Given employees, collect the distinct city names where employees reside into a Set<String>.
 */

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Question_20 {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getSampleEmployees();
        Set<String> cityName = employees.stream()
                                        .map(employee -> employee.getCity())
                                        .collect(Collectors.toSet());

        System.out.println(cityName);
    }
}
