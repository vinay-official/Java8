package com.learnJava.practice;

/*
Given products, check if there is any product with stock greater than 200 using anyMatch.
 */

import java.util.List;

public class Question_24 {
    public static void main(String[] args) {
        List<Product> products = Product.getSampleProducts();
        Boolean product = products.stream()
                                  .anyMatch(p -> p.getStock() > 200);

        System.out.println(product);

    }
}
