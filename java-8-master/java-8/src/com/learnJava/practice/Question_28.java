package com.learnJava.practice;
/*
Given employees, sort them by name alphabetically and collect them into a List<Employee>.
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question_28 {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getSampleEmployees();
        List<Employee> sortedEmployees = employees.stream()
                                                  .sorted(Comparator.comparing(employee -> employee.getName()))
                                                  .collect(Collectors.toList());
        System.out.println(sortedEmployees);
    }
}
