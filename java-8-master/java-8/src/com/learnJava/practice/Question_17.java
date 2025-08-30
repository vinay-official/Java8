package com.learnJava.practice;
/*
Given employees, filter employees who work in the "Sales" department and collect them into a List<Employee>
 */

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Question_17 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getSampleEmployees();

        List<Employee> result = employeeList.stream()
                                            .filter(employee -> employee.getDepartment().equals("Sales"))
                                            .collect(toList());

        System.out.println(result);
    }
}
