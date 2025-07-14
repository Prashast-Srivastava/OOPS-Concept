package com.prashast.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
//                    that is compatible with different data types.
//                    <T, U> type parameter (placeholder that gets replaced with a real type)
//                    <String> type argument (specifies the type)

//        ArrayList<String> fruits =  new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("PineApple");
//
//        System.out.println(fruits);

//        Box<String> box =  new Box<>();
//        box.setItem("banana");
//        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("Banana", 25.33);
        Product<String, Integer> product2 = new Product<>("Ticket", 25);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());


    }
}
