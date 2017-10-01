package com.bvan.oop.lessons7_8.generic.format;

import com.bvan.oop.common.Person;

/**
 * @author bvanchuhov
 */
public class PrinterRunner {

    public static void main(String[] args) {
        Printer<Product> printer = new Printer<>();
        printer.add(new Product("MacBook", 2000));
        printer.add(new Product("Lenovo", 1500));

        Formatter<Product> productFormatter = new CsvFormatter<>(";");
        printer.print(productFormatter);
        System.out.println();

        Printer<Person> personPrinter = new Printer<>();
        personPrinter.add(new Person("Taras", 20));
        personPrinter.add(new Person("Ivan", 40));
        personPrinter.print(new ToStringFormatter<>());
    }
}
