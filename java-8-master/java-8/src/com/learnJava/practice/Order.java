package com.learnJava.practice;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order {
    private int orderId;
    private int customerId;
    private List<OrderItem> items;
    private LocalDate orderDate;
    private String status; // e.g., "PENDING", "SHIPPED", "DELIVERED", "CANCELLED"

    public Order(int orderId, int customerId, List<OrderItem> items, LocalDate orderDate, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = items;
        this.orderDate = orderDate;
        this.status = status;
    }

    // Getters
    public int getOrderId() { return orderId; }
    public int getCustomerId() { return customerId; }
    public List<OrderItem> getItems() { return items; }
    public LocalDate getOrderDate() { return orderDate; }
    public String getStatus() { return status; }

    // Calculate total price for the order
    public double getTotalPrice() {
        if (items == null) {
            return 0.0;
        }
        return items.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", customerId=" + customerId + ", items=" + (items != null ? items.size() : 0) +
                ", orderDate=" + orderDate + ", status='" + status + '\'' + ", total=" + String.format("%.2f", getTotalPrice()) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId; // Assuming ID is the unique identifier
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    // Sample Data Generation
    public static List<Order> getSampleOrders() {
        List<OrderItem> items1 = List.of(new OrderItem(101, 1, 1250.00), new OrderItem(102, 1, 25.50)); // Laptop, Mouse
        List<OrderItem> items2 = List.of(new OrderItem(201, 3, 22.00), new OrderItem(202, 1, 55.00));    // T-Shirt, Jeans
        List<OrderItem> items3 = List.of(new OrderItem(103, 2, 75.00));                                  // Keyboard
        List<OrderItem> items4 = List.of(new OrderItem(301, 1, 85.00), new OrderItem(302, 1, 48.00));    // Coffee Maker, Toaster
        List<OrderItem> items5 = List.of(new OrderItem(203, 1, 160.00), new OrderItem(401, 10, 5.00));   // Jacket, Notebook
        List<OrderItem> items6 = List.of(new OrderItem(105, 1, 300.00));                                  // Monitor
        List<OrderItem> items7 = List.of(new OrderItem(402, 5, 12.50));                                  // Pen Set
        List<OrderItem> items8 = List.of(new OrderItem(101, 1, 1250.00), new OrderItem(103, 1, 75.00));  // Laptop, Keyboard (Repeat Cust)


        return List.of(
                new Order(1001, 501, items1, LocalDate.of(2023, 10, 25), "SHIPPED"),
                new Order(1002, 502, items2, LocalDate.of(2023, 11, 5), "DELIVERED"),
                new Order(1003, 501, items3, LocalDate.of(2023, 11, 15), "PENDING"),
                new Order(1004, 503, items4, LocalDate.of(2023, 11, 18), "SHIPPED"),
                new Order(1005, 502, items5, LocalDate.of(2023, 11, 22), "PENDING"),
                new Order(1006, 504, items6, LocalDate.of(2023, 11, 28), "CANCELLED"),
                new Order(1007, 503, items7, LocalDate.of(2023, 12, 1), "SHIPPED"),
                new Order(1008, 501, items8, LocalDate.of(2023, 12, 5), "PENDING") // Customer 501 again
        );
    }
}