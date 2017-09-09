package com.bvan.oop.lessons1_2.movie;

/**
 * @author bvanchuhov
 */
public class Movie {

    private static int movieCount = 0;

    private final int id;
    private final String title;
    private final int releaseYear;

    public Movie(String title, int releaseYear) {
        this.id = movieCount;
        this.title = title;
        this.releaseYear = releaseYear;

        movieCount++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
