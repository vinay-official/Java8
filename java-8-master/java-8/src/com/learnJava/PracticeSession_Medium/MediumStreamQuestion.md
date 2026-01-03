import java.nio.file.Paths;

import java.time.LocalDate;

import java.time.Month;

import java.util.\*;

import [java.util.stream](http://java.util.stream).Collectors;

import [java.util.stream.Stream](http://java.util.stream.Stream);

public class PracticeSessionNew {

    // --- DATA SOURCES ---

    // You can use these lists and maps to solve the problems.

    List&lt;Employee&gt; employees = Employee.getSampleEmployees();

    List&lt;Product&gt; products = Product.getSampleProducts();

    List&lt;Order&gt; orders = Order.getSampleOrders();

    List&lt;List&lt;Integer&gt;&gt; nestedNumbers = List.of(List.of(1, 2), List.of(3, 4, 5), List.of(6));

    String text = "The quick brown fox jumps over the lazy dog";

    List&lt;Integer&gt; numbers = List.of(2, 3, 4, 5);

    // 1. Given employees, group them by department into a Map&lt;String, List&lt;Employee&gt;&gt;.

    public Map&lt;String, List&lt;Employee&gt;&gt; q1_groupByDepartment() {

        // TODO: Implement the logic here.

        return null;

    }

    // 2. Given employees, group them by gender and count the number of employees in each group, resulting in a Map&lt;String, Long&gt;.

    public Map&lt;String, Long&gt; q2_countByGender() {

        // TODO: Implement the logic here.

        return null;

    }

    // 3. Given employees, calculate the average salary for each city (Map&lt;String, Double&gt;).

    public Map&lt;String, Double&gt; q3_averageSalaryByCity() {

        // TODO: Implement the logic here.

        return null;

    }

    // 4. Given employees, partition them into two groups: those aged 30 or younger and those older than 30 (Map&lt;Boolean, List&lt;Employee&gt;&gt;).

    public Map&lt;Boolean, List&lt;Employee&gt;&gt; q4_partitionByAge() {

        // TODO: Implement the logic here.

        return null;

    }

    // 5. Given employees, find the employee with the lowest salary in the "IT" department. Return Optional&lt;Employee&gt;.

    public Optional&lt;Employee&gt; q5_lowestSalaryInIT() {

        // TODO: Implement the logic here.

        return null;

    }

    // 6. Given employees, get a list of names of employees living in "London", sorted by age (ascending).

    public List&lt;String&gt; q6_londonEmployeeNamesSortedByAge() {

        // TODO: Implement the logic here.

        return null;

    }

    // 7. Given employees, calculate the sum of all salaries using reduce. Provide an initial identity value of 0.0.

    public double q7_sumSalariesWithReduce() {

        // TODO: Implement the logic here.

        return 0.0;

    }

    // 8. Given employees, get all distinct department names, sort them alphabetically, and join them into a single string separated by " | ".

    public String q8_joinDistinctDepartments() {

        // TODO: Implement the logic here.

        return null;

    }

    // 9. Given products, group them by category (Map&lt;String, List&lt;Product&gt;&gt;).

    public Map&lt;String, List&lt;Product&gt;&gt; q9_groupByCategory() {

        // TODO: Implement the logic here.

        return null;

    }

    // 10. Given products, calculate the total value of all in-stock items (sum of price \* stock for each product where stock &gt; 0).

    public double q10_totalValueInStock() {

        // TODO: Implement the logic here.

        return 0.0;

    }

    // 11. Given products, find the product with the minimum stock level in each category (Map&lt;String, Optional&lt;Product&gt;&gt; using minBy).

    public Map&lt;String, Optional&lt;Product&gt;&gt; q11_minStockByCategory() {

        // TODO: Implement the logic here.

        return null;

    }

    // 12. Given products, get a list of names of products that are out of stock (stock == 0).

    public List&lt;String&gt; q12_outOfStockProductNames() {

        // TODO: Implement the logic here.

        return null;

    }

    // 13. Given nestedNumbers, flatten it into a single List&lt;Integer&gt; containing all numbers (1, 2, 3, 4, 5, 6).

    public List&lt;Integer&gt; q13_flattenNestedNumbers() {

        // TODO: Implement the logic here.

        return null;

    }

    // 14. Given the text, split it into words (using whitespace \\\\s+ as a delimiter), convert each word to uppercase, remove duplicates, and collect them into a List&lt;String&gt;.

    public List&lt;String&gt; q14_processText() {

        // TODO: Implement the logic here.

        return null;

    }

    // 15. Given orders, find all orders placed by the customer with ID 502 and collect them into a List&lt;Order&gt;.

    public List&lt;Order&gt; q15_ordersForCustomer502() {

        // TODO: Implement the logic here.

        return null;

    }

    // 16. Given orders, calculate the sum of getTotalPrice() for all orders with status "SHIPPED".

    public double q16_sumOfShippedOrders() {

        // TODO: Implement the logic here.

        return 0.0;

    }

    // 17. Given orders, find all unique product IDs present across all items in all non-cancelled orders. Collect into a Set&lt;Integer&gt;.

    public Set&lt;Integer&gt; q17_uniqueProductIdsInNonCancelledOrders() {

        // TODO: Implement the logic here.

        return null;

    }

    // 18. Given orders, group orders by the month they were placed (Map&lt;java.time.Month, List&lt;Order&gt;&gt;).

    public Map&lt;Month, List&lt;Order&gt;&gt; q18_groupOrdersByMonth() {

        // TODO: Implement the logic here.

        return null;

    }

    // 19. Given orders, find the order with the lowest total price (ignore cancelled orders). Return Optional&lt;Order&gt;.

    public Optional&lt;Order&gt; q19_lowestPriceOrder() {

        // TODO: Implement the logic here.

        return null;

    }

    // 20. Given orders, filter orders placed after November 1st, 2023 (orderDate.isAfter(LocalDate.of(2023, 11, 1))).

    public List&lt;Order&gt; q20_ordersAfterNov1st2023() {

        // TODO: Implement the logic here.

        return null;

    }

    // 21. Read the words.txt file line by line, split each line into words (using non-word characters \\\\W+ as delimiter to handle punctuation), convert words to lowercase, filter out empty strings, and count the frequency of each word (Map&lt;String, Long&gt;).

    public Map&lt;String, Long&gt; q21_wordFrequencyFromFile() throws IOException {

        // TODO: Implement the logic here.

        return null;

    }

    // 22. Given employees, find the second oldest employee. Return Optional&lt;Employee&gt;.

    public Optional&lt;Employee&gt; q22_secondOldestEmployee() {

        // TODO: Implement the logic here.

        return null;

    }

    // 23. Given products, generate summary statistics (DoubleSummaryStatistics) for the prices of products in the "Electronics" category.

    public DoubleSummaryStatistics q23_electronicsPriceStats() {

        // TODO: Implement the logic here.

        return null;

    }

    // 24. Given employees, create a map where the key is the employee ID and the value is the employee's name (Map&lt;Integer, String&gt;).

    public Map&lt;Integer, String&gt; q24_employeeIdToNameMap() {

        // TODO: Implement the logic here.

        return null;

    }

    // 25. Given employees, find the youngest employee in each department (Map&lt;String, Optional&lt;Employee&gt;&gt;).

    public Map&lt;String, Optional&lt;Employee&gt;&gt; q25_youngestEmployeeByDept() {

        // TODO: Implement the logic here.

        return null;

    }

    // 26. Generate an infinite stream of pseudo-random doubles between 0.0 and 1.0 using Stream.generate(Math::random) and print the first 5 distinct values, rounded to 2 decimal places.

    public void q26_generateRandomDoubles() {

        // TODO: Implement the logic here.

    }

    // 27. Generate a stream of the first 15 odd numbers (1, 3, 5, ...) using Stream.iterate. Collect them into a list.

    public List&lt;Integer&gt; q27_first15OddNumbers() {

        // TODO: Implement the logic here.

        return null;

    }

    // 28. Given employees, sort them first by city (ascending) and then by salary (descending) within each city. Collect into a List&lt;Employee&gt;.

    public List&lt;Employee&gt; q28_sortByCityThenSalary() {

        // TODO: Implement the logic here.

        return null;

    }

    // 29. Given products, find the average stock level for products in the "Apparel" category. Return OptionalDouble.

    public OptionalDouble q29_avgStockForApparel() {

        // TODO: Implement the logic here.   @vinay

        products.stream()
            .filter(p -> "Apparel".equals(p.getCategory()))
            .mapToInt(Product::getStock)
            .average();

        return null;

    }

    // 30. Given orders, find the total quantity of product with ID 101 ordered across all orders (sum the quantities from OrderItem).

    public int q30_totalQuantityOfProduct101() {

        // TODO: Implement the logic here. @vinay

          return orders.stream()
            .flatMap(order -> order.getItems().stream())
            .filter(item -> item.getProductId() == 101)
            .mapToInt(OrderItem::getQuantity)
            .sum();

        return 0;

    }

    // 31. Given employees, find any employee whose name is exactly 5 characters long. If found, print their name; otherwise, print "No employee with 5-char name". Use Optional.

    public void q31_findEmployeeWith5CharName() {

        // TODO: Implement the logic here.    @vinay

        employees.stream()
        .filter(e -> e.getName().length() == 5)
        .findAny()
        .map(Employee::getName)
        .ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No employee with 5-char name")
        );


    }

    // 32. Given products, create a map where the key is the category and the value is the set of product IDs in that category (Map&lt;String, Set&lt;Integer&gt;&gt;).

    public Map&lt;String, Set&lt;Integer&gt;&gt; q32_productIdsByCategory() {

        // TODO: Implement the logic here.  @vinay

        Map<String, Set<Integer>> result =
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(
                                Product::getId,
                                Collectors.toSet()
                        )
                ));

        return null;

    }

    // 33. Given employees, calculate the sum of ages of all employees using reduce without an identity value. Return Optional&lt;Integer&gt;.

    public Optional&lt;Integer&gt; q33_sumAgesWithReduceNoIdentity() {

        // TODO: Implement the logic here.    @vinay

        public Optional<Integer> q33_sumAgesWithReduceNoIdentity() {

    return employees.stream()
            .map(Employee::getAge)
            .reduce(Integer::sum);
}


        return null;

    }

    // 34. Read words.txt, find all unique words containing the letter 'a' (case-insensitive), convert them to uppercase, and collect them into a sorted Set&lt;String&gt;.

    public Set&lt;String&gt; q34_uniqueWordsWithAFromFile() throws IOException {

        // TODO: Implement the logic here.

        return null;

    }

    // 35. Given orders, find all customer IDs who have placed at least one order with a total value less than $100. Collect unique IDs into a Set&lt;Integer&gt;.

    public Set&lt;Integer&gt; q35_customersWithCheapOrders() {

        // TODO: Implement the logic here.

        return null;

    }

    // 36. Given employees, use peek to print the salary of each employee before filtering for those earning more than 80000, and then collect their names into a list.

    public List&lt;String&gt; q36_peekAndFilterSalaries() {

        // TODO: Implement the logic here.

        return null;

    }

    // 37. Given numbers = List.of(2, 3, 4, 5), calculate the product of all numbers using reduce.

    public long q37_productOfNumbers() {

        // TODO: Implement the logic here.

        return 0;

    }

    // 38. Given employees, find the department name(s) with the highest average salary. Return a Set&lt;String&gt;.

    public Set&lt;String&gt; q38_deptsWithHighestAvgSalary() {

        // TODO: Implement the logic here.

        return null;

    }

    // 39. Given products, get the names of the top 2 products with the highest stock count.

    public List&lt;String&gt; q39_top2ProductsByStock() {

        // TODO: Implement the logic here.

        return null;

    }

    // 40. Given orders, find the customer ID who has placed the maximum number of orders. Return Optional&lt;Map.Entry&lt;Integer, Long&gt;&gt; where key is customerId, value is order count.

    public Optional&lt;Map.Entry&lt;Integer, Long&gt;&gt; q40_customerWithMaxOrders() {

        // TODO: Implement the logic here.

        return null;

    }

    // 41. You are given a list of numbers. which may contain null values. Your task is to fetch all numbers that starts with digit 1.
    
    public List<Integer> q41_numberstartswith1() {
         // TODO: Implement the logic here.
            return null;

    }

    // 42 Find the first unique number in an array.

    public int q42_FindFirstUniqueNumber() {
         // TODO: Implement the logic here.
            return null;
    
    }

}
