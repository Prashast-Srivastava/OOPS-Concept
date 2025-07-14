package com.prashast.constructor;

public class Human {
    private int age ;
    private String name ;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public Human(){
        age = 21;
        name = "Prashast";
    }
    public Human(int age,String name) {
        this.age = age;
        this.name = name;
    }
}
