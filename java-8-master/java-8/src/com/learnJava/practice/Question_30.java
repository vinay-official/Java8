package com.learnJava.practice;
/*
Given employees, calculate the average salary of all employees using mapToDouble and average. Print the OptionalDouble.
 */

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Question_30 {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getSampleEmployees();
        OptionalDouble averageSalary = employees.stream()
                                                  .map(employee -> employee.getSalary())
                                                  .mapToDouble(n -> n)
                                                  .average();

        System.out.println(averageSalary.getAsDouble());
    }
}
