package com.learnJava.practice;
/*
Given employees, count the number of male employees.
 */

import java.util.List;

public class Question_18 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getSampleEmployees();
        Long count = employeeList.stream() // Stream<Employee>
                                 .map(e -> e.getGender()) // Stream<String>
                                 .filter(s->s.equals("Male"))
                                 .count();

        System.out.println(count);
    }
}
