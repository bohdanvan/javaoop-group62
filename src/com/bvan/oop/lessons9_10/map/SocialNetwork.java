package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.common.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(100L, new Person("Taras", 25));
        idToUserMap.put(5000L, new Person("Vasya", 16));
        idToUserMap.put(2000L, new Person("Tanya", 20));

        Set<Long> keySet = idToUserMap.keySet();
        Collection<Person> values = idToUserMap.values();
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();
    }
}
