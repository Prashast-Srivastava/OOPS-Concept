package com.prashast.interfaces;

public class Main {
    // Interface = A blueprint for a class that specifies a set of abstract methods
    //                     that implementing classes MUST define.
    //                     Supports multiple inheritance-like behavior.

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
