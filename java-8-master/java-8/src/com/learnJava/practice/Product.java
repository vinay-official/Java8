package com.learnJava.practice;

import java.util.List;
import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stock;

    public Product(int id, String name, String category, double price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", category='" + category + '\'' +
                ", price=" + price + ", stock=" + stock + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id; // Assuming ID is the unique identifier
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Sample Data Generation
    public static List<Product> getSampleProducts() {
        return List.of(
                new Product(101, "Laptop", "Electronics", 1250.00, 45),
                new Product(102, "Mouse", "Electronics", 25.50, 150),
                new Product(103, "Keyboard", "Electronics", 75.00, 90),
                new Product(201, "T-Shirt", "Apparel", 22.00, 210),
                new Product(202, "Jeans", "Apparel", 55.00, 115),
                new Product(301, "Coffee Maker", "Home Goods", 85.00, 35),
                new Product(302, "Toaster", "Home Goods", 48.00, 70),
                new Product(104, "Webcam", "Electronics", 60.00, 0), // Out of stock
                new Product(203, "Jacket", "Apparel", 160.00, 55),
                new Product(401, "Notebook", "Stationery", 5.00, 500),
                new Product(402, "Pen Set", "Stationery", 12.50, 300),
                new Product(105, "Monitor", "Electronics", 300.00, 25)
        );
    }
}
