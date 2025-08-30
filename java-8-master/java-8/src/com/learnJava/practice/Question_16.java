package com.learnJava.practice;

/*
Given employees, create a stream and collect all employee IDs into a List<Integer>.
 */

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Question_16 {

    public static void main(String[] args) {
        List<Employee> employees = Employee.getSampleEmployees();

        List<Integer> result = employees.stream() // Stream<Employee>
                                        .map(employee -> employee.getId())
                                        .collect(toList());

        System.out.println(result);
    }
}
