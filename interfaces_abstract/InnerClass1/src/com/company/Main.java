package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        /*
        U can only create instances of a subclass by using the instance of the parent class.

         */
//	    GearBox macLaren = new GearBox(6);
//        GearBox.Gear first = macLaren.new Gear(1, 12.3);
//        GearBox.Gear second = macLaren.new Gear(2, 15.4);
//
//        System.out.println(first.driveSpeed(1000));
//        System.out.println(second.driveSpeed(12));
//        macLaren.addGear(1, 5.3);
//        macLaren.addGear(2, 10.6);
//        macLaren.addGear(3, 15.9);
//        macLaren.operateClutch(true);
//        macLaren.changeGear(1);
//        macLaren.operateClutch(false);
//        System.out.println(macLaren.wheelSpeed(1000));
//        macLaren.changeGear(2);
//        System.out.println(macLaren.wheelSpeed(3000));
//        macLaren.operateClutch(true);
//        macLaren.changeGear(3);
//        macLaren.operateClutch(false);
//        System.out.println(macLaren.wheelSpeed(6000));
        // local class
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        // anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
