package com.gaurav.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author gaurav kabra
 * @since 15 Oct 2021
 **/
public class Human {

    private boolean isAlive;

    public void setIsAlive(boolean alive) {
        System.out.println("Setter called");
        this.isAlive = alive;
    }

    @PostConstruct
    private void afterBorn() {
        System.out.println("I just born");
    }

    @PreDestroy
    private void beforeDeath() {
        System.out.println("I am about to die");
        this.isAlive = !this.isAlive;
    }

    @Override
    public String toString() {
        return "Is human alive? " + this.isAlive;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Human human = context.getBean("human", Human.class);
        System.out.println(human);
        ((ClassPathXmlApplicationContext)context).close();
        System.out.println(human);
    }
}
