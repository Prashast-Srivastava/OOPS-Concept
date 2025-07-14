package com.prashast.statics;

public class Mobile {

    static String type;
    int price;
    String brand;
    String name;

    static {
        type = "Smartphone";
        System.out.println("In the static block");
    }

    public Mobile() {
        System.out.println("In the constructor");
        name = "galaxy";
        price = 200;
        brand = " ";
    }

    void display(){
        System.out.println(type + ": " + brand + ": " + name + ": " + price);
    }

    static void show(Mobile obj){
        System.out.println("In the static block");
        System.out.println(type + ": " + obj.brand + ": " + obj.name + ": " + obj.price);
    }
}
