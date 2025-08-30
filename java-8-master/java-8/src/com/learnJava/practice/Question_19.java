package com.learnJava.practice;

/*
Given employees, find the employee with the highest salary. Print the Optional<Employee>.
 */

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question_19 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getSampleEmployees();
        Optional<Employee> maxSalary = employeeList.stream()
                                                   .max(Comparator.comparing(employee -> employee.getSalary()));

        System.out.println(maxSalary.get());
    }
}
