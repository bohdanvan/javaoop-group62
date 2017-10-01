package com.bvan.oop.lessons7_8.generic.format;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Printer<T> {

    private final List<T> elems = new LinkedList<>();

    public void add(T elem) {
        elems.add(elem);
    }

    public void print(Formatter<T> formatter) {
        for (T product : elems) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
