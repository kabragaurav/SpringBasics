package com.gaurav.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author gaurav kabra
 * @since 15 Oct 2021
 **/
@Component
@ComponentScan(basePackages = "com.gaurav.lifecycle")
@Configuration
public class BuiltIn implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("@PreDestroy method called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("@PostConstruct method called");
    }

    private void hello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BuiltIn.class);
        BuiltIn builtIn = context.getBean("builtIn", BuiltIn.class);
        ((AnnotationConfigApplicationContext)context).registerShutdownHook();
        builtIn.hello();
    }
}
