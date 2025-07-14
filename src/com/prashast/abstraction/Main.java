package com.prashast.abstraction;

public class Main {
    // abstract = Used to define abstract classes and methods.
    //                   Abstraction is the process of hiding implementation details
    //                   and showing only the essential features.
    //                   Abstract classes CAN'T be instantiated directly.
    //                   Can contain 'abstract' methods (which must be implemented)
    //                   Can contain 'concrete' methods (which are inherited)

    public static void main(String[] args) {
//        Shape shape = new Shape();
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2,4);
        Rectangle rectangle = new Rectangle(2,4);

        circle.display();
        System.out.println(circle.area());
        triangle.display();
        System.out.println(triangle.area());
        rectangle.display();
        System.out.println(rectangle.area());
    }
}
