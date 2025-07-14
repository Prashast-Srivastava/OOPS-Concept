package com.prashast.polymorphism;

public class Ex {
    // Polymorphism = "POLY-" = "MANY"
    //                "-MORPH" = "SHAPE"
    //                Objects can identify as other objects.
    //                Objects can be treated as objects of a common superclass.

    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle v : vehicles){
            v.go();
        }
    }
}
