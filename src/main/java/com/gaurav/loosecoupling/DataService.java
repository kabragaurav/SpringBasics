package com.gaurav.loosecoupling;

/**
 * @author gaurav kabra
 * @since 12 Oct 2021
 **/
public class DataService implements Service{
    @Override
    public void service() {
        System.out.println("Data Service Started...");
    }
}
