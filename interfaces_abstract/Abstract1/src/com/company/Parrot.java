package com.company;

public class Parrot extends Bird implements CanFly {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flying to the moon...");
    }
}
