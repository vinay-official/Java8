package com.learnJava.practice;

import java.util.Objects;

public class OrderItem {
    private int productId;
    private int quantity;
    private double price; // Price per unit at the time of order

    public OrderItem(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "OrderItem{" + "productId=" + productId + ", quantity=" + quantity + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return productId == orderItem.productId && quantity == orderItem.quantity && Double.compare(orderItem.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, quantity, price);
    }
}