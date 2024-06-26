package com.gaurav.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author gaurav kabra
 * @since 14 Oct 2021
 **/


@Component("college")
public class College {

    private CollegePrincipal collegePrincipal;

    public College() {

    }

    public College(CollegePrincipal collegePrincipal) {
        System.out.println("Principal created in ctor of college");
        this.collegePrincipal = collegePrincipal;
    }

    public void setCollegePrincipal(CollegePrincipal collegePrincipal) {
        System.out.println("Setter for principal called");
        this.collegePrincipal = collegePrincipal;
    }

    @Override
    public String toString() {
        return "This is a college.";
    }

    public static void main(String[] args) {
        // IF USE BELOW STMT. THEN NO NEED FOR CONFIG FILE
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.gaurav.annotations");
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
//        College college = context.getBean("college", College.class);
//        College college = context.getBean("getCollegeBean", College.class);
        College college = context.getBean("getCollege", College.class);
        System.out.println(college);
    }
}
