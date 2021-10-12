package com.gaurav.objectinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaurav kabra
 * @since 12 Oct 2021
 **/
public class Student {

    private String id;
    private static Cheat cheat;

    public void setId(String id) {
        this.id = id;
    }

    public static void setCheat(Cheat cheat) {
        Student.cheat = cheat;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectinjection.xml");
        Student student = context.getBean("student", Student.class);
        student.cheat.startCheat();
    }
}
