package com.learnJava.practice;

import java.util.List;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String city;
    private double salary;
    private String gender;

    public Employee(int id, String name, int age, String department, String city, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.city = city;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters (Essential for streams)
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public String getCity() { return city; }
    public double getSalary() { return salary; }
    public String getGender() { return gender; }

    // Setters (Optional, but good practice)
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setDepartment(String department) { this.department = department; }
    public void setCity(String city) { this.city = city; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age +
                ", department='" + department + '\'' + ", city='" + city + '\'' +
                ", salary=" + salary + ", gender='" + gender + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id; // Assuming ID is the unique identifier
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Sample Data Generation
    public static List<Employee> getSampleEmployees() {
        return List.of(
                new Employee(1, "Alice", 29, "IT", "New York", 75000, "Female"),
                new Employee(2, "Bob", 35, "Sales", "London", 80000, "Male"),
                new Employee(3, "Charlie", 25, "IT", "New York", 70000, "Male"),
                new Employee(4, "Diana", 42, "HR", "London", 90000, "Female"),
                new Employee(5, "Ethan", 31, "Sales", "Paris", 82000, "Male"),
                new Employee(6, "Fiona", 28, "IT", "Paris", 72000, "Female"),
                new Employee(7, "George", 45, "Finance", "New York", 110000, "Male"),
                new Employee(8, "Hannah", 30, "HR", "London", 88000, "Female"),
                new Employee(9, "Ian", 22, "IT", "New York", 65000, "Male"),
                new Employee(10, "Julia", 38, "Finance", "Paris", 105000, "Female"),
                new Employee(11, "Ken", 33, "Sales", "New York", 85000, "Male"),
                new Employee(12, "Laura", 26, "IT", "London", 71000, "Female")
        );
    }
}

