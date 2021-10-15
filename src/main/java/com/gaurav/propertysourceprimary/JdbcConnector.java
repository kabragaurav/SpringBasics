package com.gaurav.propertysourceprimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author gaurav kabra
 * @since 15 Oct 2021
 **/

@Component
public class JdbcConnector {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Autowired
    //    INSTEAD BELOW LINE, WE PUT @PRIMARY IN STUDENTUSER CLASS
//    @Qualifier("studentUser")
    private UserType userType;

    @Override
    public String toString() {
        return "Connection successful!\n" +
                "Username: " + this.username + "\n" +
                "Password: " + this.password + "\n" +
                "And type of user is " + this.userType.displayType();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.gaurav.propertysourceprimary");
        JdbcConnector jdbcConnector = context.getBean("jdbcConnector",  JdbcConnector.class);
        System.out.println(jdbcConnector);
    }

}
