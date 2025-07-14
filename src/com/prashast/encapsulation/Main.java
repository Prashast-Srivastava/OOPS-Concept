package com.prashast.encapsulation;

public class Main {

    // They help protect object data and add rules for accessing or modifying them.
    // GETTERS = Methods that make a field READABLE.
    // SETTERS = Methods that make a field WRITEABLE.

    public static void main(String[] args) {
        Car car = new Car("Charger", "Yellow", 10000);

//        car.model = "BMW";
        car.setColor("Red");
        car.setPrice(0);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }

}
