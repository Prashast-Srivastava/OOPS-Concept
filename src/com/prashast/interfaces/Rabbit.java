package com.prashast.interfaces;

public class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("*The Rabbit is running away*");
    }
}
