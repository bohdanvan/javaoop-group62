package com.bvan.oop.lessons7_8.iteration;

/**
 * @author bvanchuhov
 */
public class Film {

    private final String name;
    private final int releaseYear;

    public Film(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
