package com.company;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can i go the swin stead?");
    }
}
