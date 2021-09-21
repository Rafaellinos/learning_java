package com.rafaelinos;

public class RafaelinosMain {

    public static void main(String[] args) {
        ITelephone timPhone;
        timPhone = new DeskPhone(123456);
        timPhone.powerOn();
        timPhone.callPhone(123456);
        timPhone.answer();

        timPhone = new MobilePhone(2345);
        timPhone.callPhone(2345);
        timPhone.answer();

    }
}
