package com.prashast.inheritance;

import com.prashast.classes.Calci;

public class Main {
    public static void main(String[] args) {
        ScientificCal obj = new ScientificCal();
        System.out.println(obj.add(2,3));
        System.out.println(obj.sub(9,1));
        System.out.println(obj.div(4,2));
        System.out.println(obj.mul(4,3));
        System.out.println(obj.power(2,3));
    }
}
