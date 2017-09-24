package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class Formatters {
    
    private Formatters() {}

    public static Formatter toStringFormatter() {
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }

    public static Formatter priceFormatter() {
        return product -> String.valueOf(product.getPrice());
    }

    public static Formatter jsonFormatter() {
        return new JsonFormatter();
    }
    
    private static class JsonFormatter implements Formatter {
        @Override
        public String format(Product product) {
            return "{\"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "}";
        }
    }
}
