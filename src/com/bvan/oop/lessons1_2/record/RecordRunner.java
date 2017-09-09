package com.bvan.oop.lessons1_2.record;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class RecordRunner {

    public static void main(String[] args) {
        OldRecord record = new OldRecord("Java");
        Date date = record.getDate();
        date.setTime(0L);

        System.out.println(record.getDate());
    }
}
