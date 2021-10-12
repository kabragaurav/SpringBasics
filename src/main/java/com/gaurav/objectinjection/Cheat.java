package com.gaurav.objectinjection;

/**
 * @author gaurav kabra
 * @since 12 Oct 2021
 **/
public class Cheat {

    private String id;

    public Cheat(String id) {
        this.id = id;
    }

    public void startCheat() {
        System.out.println("" + this.id + " has started cheating...");
    }
}
