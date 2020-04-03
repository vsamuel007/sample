package com.company;

import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
        final String hello_world = "Hello world";
        System.out.println(hello_world);
        Product product = new Product("box");
        System.out.println(product.getName());
    }
}
