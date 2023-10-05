package com.example.demo.Orders;

public class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Could not find the order " + id);
    }
}