package com.prashast.encapsulation;

public class Car {
    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("The price can't be less than or equals to zero");
        }else {
            this.price = price;
        }
    }
}
