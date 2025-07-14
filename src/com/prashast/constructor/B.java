package com.prashast.constructor;

public class B extends A{
    public B() {
        super();
        System.out.println("In a B class");
    }
    public B(int n) {
        this();   // this will execute the constructor of the same class.
        System.out.println("In a B class int");
    }

}
