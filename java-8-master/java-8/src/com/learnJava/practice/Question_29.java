package com.learnJava.practice;

/*
Given products, sort them by stock level in ascending order and collect them into a List<Product>.
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question_29 {
    public static void main(String[] args) {
        List<Product> products = Product.getSampleProducts();
        List<Product> sortedProduct = products.stream()
                                              .sorted(Comparator.comparing(product -> product.getStock()))
                                              .collect(Collectors.toList());

        System.out.println(sortedProduct);
    }
}
