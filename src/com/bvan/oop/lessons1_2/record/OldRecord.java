package com.bvan.oop.lessons1_2.record;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class OldRecord {

    private final String name;
    private final Date date = new Date();

    public OldRecord(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date; // BAD CODE, should be new Date(date.getTime())
    }

    @Override
    public String toString() {
        return "OldRecord{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
