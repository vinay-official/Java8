package com.learnJava.practice;

/*
Given products, collect all product names into a List<String>.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Question_22 {
    public static void main(String[] args) {
        List<Product> products = Product.getSampleProducts();
        List<String> productNames = products.stream()
                                            .map(product -> product.getName())
                                            .collect(Collectors.toList());

        System.out.println(productNames);
    }
}
