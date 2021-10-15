package com.gaurav.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaurav kabra
 * @since 14 Oct 2021
 **/

//    BELOW CODE IS WHEN NOT USING @BEAN ANNOTATION
//@Configuration
//@ComponentScan(basePackages = "com.gaurav.annotations")
//public class CollegeConfig {
//
//}

@Configuration
public class CollegeConfig {

    // BELOW CODE FOR GIVING CUSTOM NAME TO COLLEGE BEAN
//    @Bean("getCollege")
//    public College getCollegeBean() {
//        return new College();
//    }

    @Bean("getPrincipal")
    public CollegePrincipal getPrincipalBean() {
        return new CollegePrincipal();
    }

    // BELOW CODE FOR CTOR INJECTION
//    @Bean("getCollege")
//    public College getCollegeBean() {
//        return new College(getPrincipalBean());
//    }

    //     BELOW CODE FOR SETTER INJECTION
    //     ALSO MANY ALIASES FOR COLLEGE BEAN
    @Bean({"getCollege", "college"})
    public College getCollegeBean() {
        College college = new College();
        college.setCollegePrincipal(getPrincipalBean());
        return college;
    }


}
