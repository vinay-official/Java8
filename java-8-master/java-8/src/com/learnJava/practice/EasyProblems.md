List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8);

Given numbers, create a stream and print each number to the console using forEach.
Given numbers, filter out all odd numbers and collect the remaining even numbers into a List<Integer>.
Given numbers, create a stream, square each number (n*n), and collect the results into a List<Integer>.
Given numbers, count the total number of elements in the stream.
Given numbers, find the largest number in the stream using max. Print the Optional<Integer> result.
Given numbers, find the smallest number in the stream using min. Get the integer value, assuming the list is not empty.
Given numbers, check if any number in the stream is divisible by 5 using anyMatch.
Given numbers, check if all numbers in the stream are positive (> 0) using allMatch.
Given numbers, find the first number greater than 5 using filter and findFirst. Print the Optional<Integer>.
Given numbers, create a stream, skip the first 4 elements, and collect the rest into a List<Integer>.
Given numbers, create a stream, limit it to the first 3 elements, and collect them into a List<Integer>.
Given numbers, create a stream, find the unique numbers, and collect them into a Set<Integer>.
*************************************************************************************************************************************

List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");

Given words, create a stream, convert each word to its length, and collect the lengths into a List<Integer>.
Given words, create a stream, filter words that start with the letter 'c', and count how many there are.
Given words, find any word that contains the letter 'e' using findAny. Print the Optional<String>.

**************************************************************************************************************************************

List<Employee> employees = Employee.getSampleEmployees();

Given employees, create a stream and collect all employee IDs into a List<Integer>.
Given employees, filter employees who work in the "Sales" department and collect them into a List<Employee>.
Given employees, count the number of male employees.
Given employees, find the employee with the highest salary. Print the Optional<Employee>.
Given employees, collect the distinct city names where employees reside into a Set<String>.

****************************************************************************************************************************************

Given products, filter products with a price less than $50.00 and collect them into a List<Product>.
Given products, collect all product names into a List<String>.
Given products, count how many products are in the "Apparel" category.
Given products, check if there is any product with stock greater than 200 using anyMatch.

*****************************************************************************************************************************************
Create an IntStream representing numbers from 5 to 15 (inclusive) and calculate their sum.
Create a stream from the array String[] letters = {"X", "Y", "Z", "A"}; and collect it into a sorted list.
Given numbers, calculate the sum of all numbers using mapToInt followed by sum.
Given employees, sort them by name alphabetically and collect them into a List<Employee>.
Given products, sort them by stock level in ascending order and collect them into a List<Product>.
Given employees, calculate the average salary of all employees using mapToDouble and average. Print the OptionalDouble.