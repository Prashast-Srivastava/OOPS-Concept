
package com.prashast.constructor;

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1  = new Human(21,"Prince");
//        obj.name = "Prince";
//        obj.age = 21;

//        obj.setAge(21);
//        obj.setName("Prince");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

//        System.out.println(obj.name);
    }
}
