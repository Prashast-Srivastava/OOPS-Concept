package com.prashast.constructor;

public class A {
    public A(){
        super();
        System.out.println("In class A");
    }
    public A(int n) {
        super();   // super means call the constructor of superclass.
        System.out.println("In a A class int");
    }
}
