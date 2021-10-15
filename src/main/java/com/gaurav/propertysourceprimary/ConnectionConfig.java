package com.gaurav.propertysourceprimary;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author gaurav kabra
 * @since 15 Oct 2021
 **/

@Configuration
@ComponentScan(basePackages = "com.gaurav.propertysourceprimary")
@PropertySource("propertysourceprimary.properties")
public class ConnectionConfig {

}
