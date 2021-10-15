package com.gaurav.propertysourceprimary;

import org.springframework.stereotype.Component;

/**
 * @author gaurav kabra
 * @since 15 Oct 2021
 **/

@Component
public class TeacherUser implements UserType{

    @Override
    public String displayType() {
        return "I am teacher user";
    }

}
