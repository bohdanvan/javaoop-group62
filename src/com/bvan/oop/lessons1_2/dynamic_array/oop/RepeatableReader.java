package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RepeatableReader {

    Scanner scanner;

    public RepeatableReader(InputStream in) {
        scanner = new Scanner(in);
    }

    public int readInt() {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }
}
