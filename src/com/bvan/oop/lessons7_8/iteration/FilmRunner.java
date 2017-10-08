package com.bvan.oop.lessons7_8.iteration;

import java.util.Iterator;

/**
 * @author bvanchuhov
 */
public class FilmRunner {

    public static void main(String[] args) {
        Films films = new Films();

        films.add(new Film("A", 1990));
        films.add(new Film("B", 2000));

        Iterator<Film> iterator = films.iterator();
        while (iterator.hasNext()) {
            Film film = iterator.next();
            System.out.println(film);
        }

//        for (Film film: films) {
//            System.out.println(film);
//        }
    }
}
