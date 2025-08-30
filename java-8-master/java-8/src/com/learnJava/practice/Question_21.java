package com.learnJava.practice;

/*
Given products, filter products with a price less than $50.00 and collect them into a List<Product>.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Question_21 {
    public static void main(String[] args) {

        List<Product> products = Product.getSampleProducts();
        List<Product> cheapProduct = products.stream()
                                             .filter(product -> product.getPrice() < 50)
                                             .collect(Collectors.toList());

        System.out.println(cheapProduct);

    }
}
