package com.bvan.oop.lessons1_2.dog;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Trainer {

    private final String name;
    private final ArrayList<Dog> dogs = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public void train(Dog dog) {
        dogs.add(dog);
    }

    public void giveCommand() {
        System.out.println("I'm " + name);
        for (Dog dog : dogs) {
            dog.bark();
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                '}';
    }
}
