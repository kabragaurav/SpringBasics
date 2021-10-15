package com.gaurav.propertysourceprimary;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author gaurav kabra
 * @since 15 Oct 2021
 **/

@Component
@Primary
public class StudentUser implements UserType {

    @Override
    public String displayType() {
        return "I am student user";
    }

}
