package com.bvan.oop.lessons5_6.format.proc;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class ProcCartRunner {

    public static void main(String[] args) {
        ProcCart cart = new ProcCart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));

        cart.print("name");
        System.out.println();

        cart.print("csv");
        System.out.println();

        cart.print("json");
        System.out.println();
    }
}
