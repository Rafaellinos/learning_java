package com.rafaelinos;

public interface ITelephone {
    // we dont need access modifiers, because we cant have private methods to implement
    // since private attributes cannot be modified for the class who inherit
    // forces who implements the class also implements all methods
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
