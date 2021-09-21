package com.rafaelinos;

public class GearBox {

    private boolean clutchIsIn;

    public void operateClutch(String inOrOut) {
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
