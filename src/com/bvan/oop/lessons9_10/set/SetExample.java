package com.bvan.oop.lessons9_10.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> uniqueLanguages = new LinkedHashSet<>();

        uniqueLanguages.add("Java");
        uniqueLanguages.add("Kotlin");
        uniqueLanguages.add("JavaScript");
        uniqueLanguages.add("Java");
        uniqueLanguages.add("Kotlin");
        uniqueLanguages.add("Java");
        uniqueLanguages.add("Kotlin");
        uniqueLanguages.add("Scala");
        uniqueLanguages.add("JavaScript");
        uniqueLanguages.add("JavaScript");

        System.out.println(uniqueLanguages);

        System.out.println(uniqueLanguages.contains("C#"));
    }
}
