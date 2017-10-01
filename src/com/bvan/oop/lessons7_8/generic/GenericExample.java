package com.bvan.oop.lessons7_8.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Taras");
        names.add("Ivan");

        System.out.println(names);
    }
}
