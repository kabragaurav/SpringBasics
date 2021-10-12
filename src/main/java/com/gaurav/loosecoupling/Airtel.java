package com.gaurav.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaurav kabra
 * @since 12 Oct 2021
 **/
public class Airtel {

    private Service service;

    public void activateService() {
        service.service();
    }

    public void setService(Service service) {
        this.service = service;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("loosecoupling.xml");
        Airtel airtel = context.getBean("airtel", Airtel.class);
        airtel.activateService();
    }
}
