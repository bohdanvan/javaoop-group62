package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person p = new Person("Taras", 30);
        String message = p.sayHello();
        System.out.println(message);
    }
}
