package com.prashast.classes;

public class Computer {
    public static void main(String[] args) {
        Component compObj = new Component();
        String str = compObj.getPen(2);
        System.out.println(str);
        compObj.playMusic();
    }
}
