package com.rafaelinos;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, deskpohone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing" + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answerring the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        isRinging = phoneNumber == myNumber;
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
