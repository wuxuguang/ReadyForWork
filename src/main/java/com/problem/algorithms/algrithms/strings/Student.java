package com.problem.algorithms.algrithms.strings;

/**
 * Created by wuxuguang on 2017/5/14.
 */
public class Student {
    private int key;
    private String name;

    public Student(String name, int key) {
        this.name = name;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
