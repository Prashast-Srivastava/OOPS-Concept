package com.prashast.statics;

public class Main {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.name = "iPhone-15";
        obj1.price = 15000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";

//        obj1.display();
        obj2.display();

//        Mobile.show(obj1);
    }
}
