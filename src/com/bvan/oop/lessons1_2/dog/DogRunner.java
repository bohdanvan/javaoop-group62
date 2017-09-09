package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog barsic = new Dog("Barsic", "Ivan");
        barsic.bark(3);
        System.out.println();

        Owner ivan = new Owner("Ivan", barsic);
        ivan.giveCommand();
        System.out.println();

        Trainer petya = new Trainer("Petya");
        petya.train(barsic);
        petya.train(new Dog("Ponchik"));
        petya.train(new Dog("Rex"));
        petya.giveCommand();
    }
}
