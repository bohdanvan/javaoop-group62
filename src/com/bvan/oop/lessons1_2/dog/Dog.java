package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private final String name;
    private final String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public Dog(String name) {
        this(name, "no owner");
    }

    public void bark() {
        System.out.println("Gav-gav, " + name);
    }

    public void bark(int count) {
        for (int i = 0; i < count; i++) {
            bark();
        }
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
