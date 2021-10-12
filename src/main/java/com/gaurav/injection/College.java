package com.gaurav.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaurav kabra
 * @since 12 Oct 2021
 **/
public class College {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injection.xml");
        Student s1 = context.getBean("usesetter", Student.class);
        System.out.println(s1);

        Student s2 = context.getBean("usector", Student.class);
        System.out.println(s2);
    }
}
