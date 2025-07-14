package com.prashast.threading;

public class Demo {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        Thread thread1 = new Thread(new OurRunnable());
        Thread thread2 = new Thread(new OurRunnable());

        thread1.start();
        thread2.start();
    }
}

