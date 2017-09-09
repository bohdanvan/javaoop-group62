package com.bvan.oop.lessons1_2.record;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class Record {

    private final String name;
    private final LocalDateTime date = LocalDateTime.now();

    public Record(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
