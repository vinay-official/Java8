package com.learnJava.practice;
/*
Given products, count how many products are in the "Apparel" category.
 */

import java.util.List;

public class Question_23 {
    public static void main(String[] args) {
        List<Product> products = Product.getSampleProducts();

        Long count = products.stream()
                              .map(product -> product.getCategory())
                              .filter(p -> p.equals("Apparel"))
                              .mapToLong(s -> 1L).sum();

        System.out.println(count);
    }
}
