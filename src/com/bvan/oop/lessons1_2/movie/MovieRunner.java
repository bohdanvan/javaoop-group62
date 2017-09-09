package com.bvan.oop.lessons1_2.movie;

/**
 * @author bvanchuhov
 */
public class MovieRunner {

    public static void main(String[] args) {
        Movie pulpFiction = new Movie("Pulp Fiction", 1994);
        Movie intrestellar = new Movie("Intrestellar", 2015);

        System.out.println(pulpFiction);
        System.out.println(intrestellar);
    }
}
