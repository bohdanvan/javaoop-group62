package com.bvan.oop.lessons9_10.io;

import java.io.Serializable;

/**
 * @author bvanchuhov
 */
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final String phone;
    private final int age;

    public Model(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
