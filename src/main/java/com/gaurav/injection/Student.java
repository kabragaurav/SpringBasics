package com.gaurav.injection;

/**
 * @author gaurav kabra
 * @since 12 Oct 2021
 **/

public class Student {
    private int id;
    private String name;

    public Student() {
        // needed for setter injection
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: " + this.id + "--" + this.name;
    }
}
