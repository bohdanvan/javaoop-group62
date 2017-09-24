package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Cart {

    private final List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(Formatter formatter) {
        for (Product product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
