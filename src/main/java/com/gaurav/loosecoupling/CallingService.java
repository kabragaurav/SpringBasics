package com.gaurav.loosecoupling;

/**
 * @author gaurav kabra
 * @since 12 Oct 2021
 **/
public class CallingService implements Service{
    @Override
    public void service() {
        System.out.println("Calling service started...");
    }
}
