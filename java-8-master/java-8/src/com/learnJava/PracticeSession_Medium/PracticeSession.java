package com.learnJava.PracticeSession_Medium;

import com.learnJava.practice.Employee;
import com.learnJava.practice.Order;
import com.learnJava.practice.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class PracticeSession {

    // 1. Given employees, group them by department into a Map&lt;String, List&lt;Employee&gt;&gt;.

    public Map<String, List<Employee>> q1_groupByDepartment() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    // 2. Given employees, group them by gender and count the number of employees in each group, resulting in a Map&lt;String, Long&gt;.

    public Map<String, Long> q2_countByGender() {
        List<Employee> employees = Employee.getSampleEmployees();

        Map<String, Long> map = employees.stream()
                                         .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        return map;
    }

    // // 3. Given employees, calculate the average salary for each city (Map&lt;String, Double&gt;).

    public Map<String,Double> q3_averageSalaryByCity() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                        .collect(Collectors.groupingBy(Employee::getCity, Collectors.averagingDouble(Employee::getSalary)));
    }

    // 4. Given employees, partition them into two groups: those aged 30 or younger and those older than 30 (Map&lt;Boolean, List&lt;Employee&gt;&gt;).

    public Map<String, List<Employee>>  q4_partitionByAge() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                        .collect(Collectors.groupingBy(employee -> employee.getAge() >= 30 ? "older than 30" : "younger than 30"));
    }

    // 5. Given employees, find the employee with the lowest salary in the "IT" department. Return Optional&lt;Employee&gt;.

    public Optional<Employee> q5_lowestSalaryInIT() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .min(Comparator.comparing(employee -> employee.getSalary()));
    }

    // 6. Given employees, get a list of names of employees living in "London", sorted by age (ascending).

    public List<String> q6_londonEmployeeNamesSortedByAge() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                .filter(employee -> employee.getCity().equals("London"))
                .sorted(Comparator.comparing(employee -> employee.getAge()))
                .map(employee -> employee.getName())
                .collect(toList());
    }

    // 7. Given employees, calculate the sum of all salaries using reduce. Provide an initial identity value of 0.0.

    public Optional<Double> q7_sumSalariesWithReduce() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                .map(employee -> employee.getSalary())
                .reduce((a, b) -> a + b);
    }

    // 8. Given employees, get all distinct department names, sort them alphabetically, and join them into a single string separated by " | ".

    public String q8_joinDistinctDepartments() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                .map(employee -> employee.getDepartment())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining( " | "));
    }

    // 9. Given products, group them by category (Map&lt;String, List&lt;Product&gt;&gt;).

    public Map<String, List<Product>> q9_groupByCategory() {
        List<Product> products = Product.getSampleProducts();

        return products.stream()
                .collect(Collectors.groupingBy(product -> product.getCategory()));
    }

    // 10. Given products, calculate the total value of all in-stock items (sum of price \* stock for each product where stock &gt; 0).

    public Double q10_totalValueInStock() {
        List<Product> products = Product.getSampleProducts();

        return products.stream()
                .filter(product -> product.getStock() > 0)
                .mapToDouble(product -> product.getPrice() * product.getStock())
                .sum();

    }

    // 11. Given products, find the product with the minimum stock level in each category (Map&lt;String, Optional&lt;Product&gt;&gt; using minBy).

    public Map<String, Optional<Product>> q11_minStockByCategory() {
        List<Product> products = Product.getSampleProducts();
        return products.stream()
                .collect(Collectors.groupingBy(product -> product.getCategory(), minBy(Comparator.comparing(p -> p.getStock()))));
    }

    // 12. Given products, get a list of names of products that are out of stock (stock == 0).

    public List<String> q12_outOfStockProductNames() {
        List<Product> products = Product.getSampleProducts();
        return products.stream()
                .filter(product -> product.getStock() == 0)
                .map(map -> map.getName())
                .collect(Collectors.toList());
    }

    // List&lt;List&lt;Integer&gt;&gt; nestedNumbers = List.of(List.of(1, 2), List.of(3, 4, 5), List.of(6));

    // 13. Given nestedNumbers, flatten it into a single List&lt;Integer&gt; containing all numbers (1, 2, 3, 4, 5, 6).

    public List<Integer> q13_flattenNestedNumbers() {
        List<List<Integer>> nestedNumbers  = List.of(List.of(1,2),List.of(3,4,5), List.of(6));

        return nestedNumbers.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
    }

    String text = "The quick brown fox jumps over the lazy dog";

    // 14. Given the text, split it into words (using whitespace \\\\s+ as a delimiter), convert each word to uppercase,
    // remove duplicates, and collect them into a List&lt;String&gt;.

    public List<String> q14_processText() {
        String text = "The quick brown fox jumps over the lazy dog";
        return  Arrays.stream(text.split(" "))
                .map(word -> word.toUpperCase())
                .distinct()
                .collect(Collectors.toList());
    }

    // 15. Given orders, find all orders placed by the customer with ID 502 and collect them into a List&lt;Order&gt;.

    public List<Order> q15_ordersForCustomer502() {
        List<Order> orders = Order.getSampleOrders();
        return orders.stream()
                .filter(order -> order.getCustomerId() == 502)
                .collect(Collectors.toList());
    }

    // 16. Given orders, calculate the sum of getTotalPrice() for all orders with status "SHIPPED".

    public Double q16_sumOfShippedOrders() {
        List<Order> orders = Order.getSampleOrders();
        return orders.stream()
                .filter(order -> order.getStatus().equals("SHIPPED"))
                .mapToDouble(o -> o.getTotalPrice()).sum();
    }

    // 17. Given orders, find all unique product IDs present across all items in all non-cancelled orders. Collect into a Set&lt;Integer&gt;.

    public Set<Integer> q17_uniqueProductIdsInNonCancelledOrders() {
        List<Order> orders = Order.getSampleOrders();
        return orders.stream()
                .filter(order -> !order.getStatus().equals("CANCELLED"))
                .map(m -> m.getItems())
                .flatMap(List::stream) // Stream<OderItem>
                .map(item -> item.getProductId())
                .collect(Collectors.toSet());
    }

    // 18. Given orders, group orders by the month they were placed (Map&lt;java.time.Month, List&lt;Order&gt;&gt;).

    public Map<java.time.Month, List<Order>> q18_groupOrdersByMonth() {
        List<Order> orders = Order.getSampleOrders();
        return orders.stream()
                .collect(Collectors.groupingBy(order -> order.getOrderDate().getMonth()));
    }

    // 19. Given orders, find the order with the lowest total price (ignore cancelled orders). Return Optional&lt;Order&gt;.

    public Optional<Order> q19_lowestPriceOrder() {
        List<Order> orders = Order.getSampleOrders();
        return orders.stream()
                .filter(order -> !order.getStatus().equals("CANCELLED"))
                .collect(Collectors.minBy(Comparator.comparing(m -> m.getTotalPrice())));
    }

    // 20. Given orders, filter orders placed after November 1st, 2023 (orderDate.isAfter(LocalDate.of(2023, 11, 1)))

    public List<Order> q20_ordersAfterNov1st2023() {
        List<Order> orders = Order.getSampleOrders();
        return orders.stream()
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2023, 11, 1)))
                .collect(Collectors.toList());
    }

    // 21. Read the words.txt file line by line, split each line into words (using non-word characters \\\\W+ as delimiter to handle punctuation),
    // convert words to lowercase,
    // filter out empty strings, and count the frequency of each word (Map&lt;String, Long&gt;).

      Map<String, Long> wordCount = Files.lines(Path.of("words.txt"))
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .map(String::toLowerCase)
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));


    // 22. Given employees, find the second oldest employee. Return Optional&lt;Employee&gt;.

    public Optional<Employee> q22_secondOldestEmployee() {
        List<Employee> employees = Employee.getSampleEmployees();
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .skip(1)
                .findFirst();
    }

    // 23. Given products, generate summary statistics (DoubleSummaryStatistics) for the prices of products in the "Electronics" category.

    public DoubleSummaryStatistics q23_electronicsPriceStats() {
        List<Product> products = Product.getSampleProducts();
       return  products.stream()
                .filter(product -> product.getCategory().equals("ELECTRONICS"))
                .mapToDouble(p -> p.getPrice())
                .summaryStatistics();
    }

    // 24. Given employees, create a map where the key is the employee ID and the value is the employee's name (Map&lt;Integer, String&gt;).

    public Map<Integer, String>  q24_employeeIdToNameMap() {
        List<Employee> employees = Employee.getSampleEmployees();
        return employees.stream()
                .collect(Collectors.toMap(employee -> employee.getId(), employee -> employee.getName()));
    }

    // 25. Given employees, find the youngest employee in each department (Map&lt;String, Optional&lt;Employee&gt;&gt;).

    public Map<String, Optional<Employee>> q25_youngestEmployeeByDept() {
        List<Employee> employees = Employee.getSampleEmployees();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, minBy(Comparator.comparing(Employee::getAge))));
    }

    // 26. Generate an infinite stream of pseudo-random doubles between 0.0 and 1.0 using Stream.generate(Math::random)
    // and print the first 5 distinct values, rounded to 2 decimal places.

    public void q26_generateRandomDoubles() {
        Stream.generate(Math::random)
                .distinct()
                .limit(5)
                .forEach(n -> System.out.println(Math.round(n * 100.0) / 100.0));
    }

    // 27. Generate a stream of the first 15 odd numbers (1, 3, 5, ...) using Stream.iterate. Collect them into a list.

    public List<Integer> q27_first15OddNumbers() {
        List<Integer> oddNumber =  Stream.iterate(1, n -> n + 2)
                .limit(15)
                .collect(toList());

        return oddNumber;
    }

    // 28. Given employees, sort them first by city (ascending) and then by salary (descending) within each city. Collect into a List&lt;Employee&gt;.

    public List<Employee> q28_sortByCityThenSalary() {
        List<Employee> employees = Employee.getSampleEmployees();
        return employees.stream()
                .sorted(
                        Comparator.comparing(Employee::getCity)
                                .thenComparing(Comparator.comparing(Employee::getSalary).reversed())
                )

                .collect(toList());
    }

    // 29. Given products, find the average stock level for products in the "Apparel" category. Return OptionalDouble.

    public OptionalDouble q29_avgStockForApparel() {
        List<Product> products = Product.getSampleProducts();
        return products.stream()
                .filter(product -> product.getCategory().equals("Apparel"))
                .mapToDouble(p -> p.getStock()).average();

    }

    // 30. Given orders, find the total quantity of product with ID 101 ordered across all orders (sum the quantities from OrderItem).

    public int q30_totalQuantityOfProduct101() {
       List<Order> orders = Order.getSampleOrders();
       return orders.stream()
               .flatMap(order -> order.getItems().stream())
               .filter(orderItem -> orderItem.getProductId() == 101)
               .mapToInt(orderItem -> orderItem.getQuantity())
               .sum();
    }

    // 31. Given employees, find any employee whose name is exactly 5 characters long.
    // If found, print their name; otherwise, print "No employee with 5-char name". Use Optional.

    public void q31_findEmployeeWith5CharName() {
        List<Employee> list = Employee.getSampleEmployees();
           Optional<String> name =  list.stream()
                                       .filter(employee -> employee.getName().length() == 5)
                                       .map(employee -> employee.getName())
                                       .findAny();

           if(name.isPresent()) {
               System.out.println(name.get());
           } else {
               System.out.println("No employee with 5-char name");
           }

    }

    // 32. Given products, create a map where the key is the category and the value is the set of product IDs in that category (Map&lt;String, Set&lt;Integer&gt;&gt;).

    public Map<String, Set<Integer>> q32_productIdsByCategory() {
        List<Product> products = Product.getSampleProducts();
        return products.stream()
                .collect(Collectors.groupingBy(product -> product.getCategory(), Collectors.mapping(Product::getId, toSet())));
    }

    // 33. Given employees, calculate the sum of ages of all employees using reduce without an identity value. Return Optional&lt;Integer&gt;.

    public Optional<Integer> q33_sumAgesWithReduceNoIdentity() {
        List<Employee> employees = Employee.getSampleEmployees();
        return employees.stream()
                .map(employee -> employee.getAge())
                .reduce((a, b) -> a + b);
    }

    // 34. Read words.txt, find all unique words containing the letter 'a' (case-insensitive),
    // convert them to uppercase, and collect them into a sorted Set&lt;String&gt;.

    // 35. Given orders, find all customer IDs who have placed at least one order with a total value less than $100. Collect unique IDs into a Set&lt;Integer&gt;.

    public Set<Integer> q35_customersWithCheapOrders() {
        List<Order> orders = Order.getSampleOrders();
        return orders.stream()
                .filter(order -> order.getTotalPrice() < 100)
                .map(order -> order.getCustomerId())
                .collect(Collectors.toSet());
    }

    // 36. Given employees, use peek to print the salary of each employee before filtering for those earning more than 80000,
    // and then collect their names into a list.

    public List<String> q36_peekAndFilterSalaries() {
        List<Employee> employees = Employee.getSampleEmployees();

        return employees.stream()
                .peek(employee -> System.out.println(employee))
                .filter(employee -> employee.getSalary() > 80000)
                .map(Employee::getName)
                .collect(toList());
    }

    // 37. Given numbers = List.of(2, 3, 4, 5), calculate the product of all numbers using reduce.

    public Optional<Integer> q37_productOfNumbers() {
        List<Integer> numbers = List.of(2, 3, 4, 5);
        return numbers.stream()
                .reduce((a, b) -> a * b);
    }

    // 38. Given employees, find the department name(s) with the highest average salary. Return a Set&lt;String&gt;

//    public Set<String> q38_deptsWithHighestAvgSalary() {
//        List<Employee> employees = Employee.getSampleEmployees();
//        employees.stream()
//                .
//    }

    // 41. You are given a list of numbers. which may contain null values. Your task is to fetch all numbers that starts with digit 1.

    public List<Integer> q41_numberstartswith1() {
        List<Integer> list = Arrays.asList(10,15,8,49,null,98,132);
        return list.stream()
                .filter(i -> Objects.nonNull(i))
                .filter(i -> i.toString().startsWith("1"))
                .collect(toList());
    }

    // 42 Find the first unique number in an array

    public Optional<Integer> q42_FindFirstUniqueNumber() {
        int array[] = new int[] {4,5,1,2,2,5,4,3};

         return Arrays.stream(array)
                .boxed()
                 .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                 .entrySet().stream()
                 .filter(entry -> entry.getValue() == 1)
                 .map(entry -> entry.getKey())
                 .findFirst();
    }

}
