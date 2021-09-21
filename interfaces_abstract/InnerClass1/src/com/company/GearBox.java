package com.company;

import java.util.ArrayList;
import java.util.List;

public class GearBox {

    private List<Gear> gears;
    private int maxGears;
    private int currentGear = 0; // renamed as currentGear to avoid shallow from gearNumber
    private boolean cluchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        this.gears.add(new Gear(0, 0.0));

//        for (int i=0; i<maxGears; i++) {
//            addGear(i, i * 5.3);
//        }
    }

    public void operateClutch(boolean in) {
        this.cluchIsIn = in;
    }

    public void addGear(int number, double ration) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ration));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < this.gears.size() && this.cluchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear: " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (cluchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }
}
