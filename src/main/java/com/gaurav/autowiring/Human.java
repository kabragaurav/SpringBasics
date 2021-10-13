package com.gaurav.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.desktop.AppForegroundListener;

/**
 * @author gaurav kabra
 * @since 13 Oct 2021
 **/
public class Human{

    @Autowired
    @Qualifier("heart2")
    private Heart heart;

    // Not needed below code if we put @Autowire annotation above variable
//    public Human() {}
//
//    @Autowired
//    public Human(Heart heart) {
//        System.out.println("One arg ctor");
//        this.heart = heart;
//    }
//
//    @Autowired
//    public void setHeart(Heart heart) {
//        System.out.println("Setter for Human");
//        this.heart = heart;
//    }

    public void respond() {
        if(heart != null) {
            System.out.println("I am alive");
        } else {
            System.out.println("I am dead");
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Human human = context.getBean("human", Human.class);
        human.respond();
    }

}
