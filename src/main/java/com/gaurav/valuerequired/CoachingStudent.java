package com.gaurav.valuerequired;

import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.annotation.Validated;

/**
 * @author gaurav kabra
 * @since 144 Oct 2021
 **/

public class CoachingStudent {

    @Value("${name}")
    private String name;

    @Value("${course}")
    private String course;

    @Value("${hobby}")
    private String hobby;

//    @Value("${name}")
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Value("${course}")
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    @Value("${hobby}")
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }

    @Override
    public String toString() {
        return this.name +
                " is interested in " + this.course +
                " and has hobby " + this.hobby +
                ".";
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("valuerequired.xml");
        CoachingStudent cs = context.getBean("student", CoachingStudent.class);
        System.out.println(cs);
    }
}
