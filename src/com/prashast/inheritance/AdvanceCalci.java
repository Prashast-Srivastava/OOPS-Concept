package com.prashast.inheritance;

public class AdvanceCalci extends Calc{

    public int mul(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1 , int n2){
        if (n2 == 0) {
            System.out.println("can't divide by zero");
        }
        return n1 / n2;
    }
}
