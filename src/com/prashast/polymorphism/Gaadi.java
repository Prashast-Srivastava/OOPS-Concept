package com.prashast.polymorphism;

public class Gaadi{
    String make;
    String model;
    int year;
    String color;

    public Gaadi(String make, String model, int year, String color) {
        this.color = color;
        this.make = make;
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString() {
        return this.make + ":" + this.model + ":" + this.year + ":" + this.color;
    }
}