package com.prashast.array.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(2);
        list.add(10);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("PineApple");

        fruits.add("Mango");
        fruits.remove(0);
        fruits.set(2,"Grapes");

        Collections.sort(fruits);

        System.out.println(fruits);
        System.out.println(fruits.size());

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
