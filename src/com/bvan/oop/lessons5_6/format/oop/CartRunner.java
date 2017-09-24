package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

import static com.bvan.oop.lessons5_6.format.oop.Formatters.*;
import static com.bvan.oop.lessons5_6.format.oop.Formatters.jsonFormatter;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));

        cart.print(new NameFormatter());
        System.out.println();

        cart.print(new CsvFormatter(";"));
        System.out.println();

        cart.print(jsonFormatter());
        System.out.println();

        cart.print(toStringFormatter());
    }
}
