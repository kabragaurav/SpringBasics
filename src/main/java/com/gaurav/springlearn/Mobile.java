package com.gaurav.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaurav kabra
 * @since 11 Oct 2021
 **/
public class Mobile {
    /**
     * IMP : Project Setup https://stackoverflow.com/a/38941263
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springlearn.xml");
        Sim sim = context.getBean("sim", Sim.class);
        sim.print();
    }
}
