package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private int size = 0;
    private int[] elems;
    private final double growFactor;

    public DynamicArray(int initSize, double aGrowFactor) {
        elems = new int[initSize];
        growFactor = aGrowFactor;
    }

    public DynamicArray() {
        this(4, 1.5);
    }

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int)(elems.length * growFactor);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            String s = String.valueOf(elems[i]);
            joiner.add(s);
        }
        return joiner.toString();
    }
}
