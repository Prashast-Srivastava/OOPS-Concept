package com.prashast.polymorphism;

public class Demo {
    // .toString() = Method inherited from the Object class.
    //                       Used to return a string representation of an object.
    //                       By default, it returns a hash code as a unique identifier.
    //                       It can be overridden to provide meaningful details.

    public static void main(String[] args) {
        Gaadi car1 = new Gaadi("Ford", "Mustang", 2025, "Red");
        Gaadi car2 = new Gaadi("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}